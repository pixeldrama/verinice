/*******************************************************************************
 * Copyright (c) 2016 Daniel Murygin <dm{a}sernet{dot}de>.
 *
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.
 * If not, see <http://www.gnu.org/licenses/>.
 *
 * Contributors:
 *     Daniel Murygin <dm{a}sernet{dot}de> - initial API and implementation
 ******************************************************************************/
package sernet.verinice.service.linktable.vlt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

import org.apache.log4j.Logger;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;

import sernet.verinice.service.linktable.ILinkTableConfiguration;
import sernet.verinice.service.linktable.LinkTableConfiguration;
import sernet.verinice.service.linktable.LinkTableException;

/**
 * VeriniceLinkTableIO (de-)serialize Link Table configuration
 * instances of {@link VeriniceLinkTable} to a VLT file.
 * A VLT (verinice link table) file is a JSON file with sufix '.vlt'.
 * See JSON schema VltSchema.json in this package.
 *
 * GSON is used for (de-)serialization: https://github.com/google/gson
 *
 * Do not instantiate this class, use public static methods.
 *
 * @author Daniel Murygin <dm{a}sernet{dot}de>
 */
public abstract class VeriniceLinkTableIO {

    private static final Logger LOG = Logger.getLogger(VeriniceLinkTableIO.class);

    private static Gson gson = new GsonBuilder().setPrettyPrinting().create();

    private VeriniceLinkTableIO() {
        // Do not instantiate this class, use public static methods.
    }

    /**
     * Writes a {@link LinkTableConfiguration} to disk. Data is converted to
     * {@link VeriniceLinkTable}. VeriniceLinkTable is saved as a JSON file.
     *
     * @param configuration A link table configuration
     * @param name The name of the configuration
     * @param fullPath The full path to the file
     */
    public static void write(ILinkTableConfiguration configuration, String name, String fullPath) {
        VeriniceLinkTable vlt = createVeriniceLinkTable(configuration, name);
        write(vlt, fullPath);
    }

    /**
     * Writes a {@link VeriniceLinkTable} to disk as a JSON file.
     *
     * @param vlt A link table configuration
     * @param fullPath The full path to the file
     */
    public static void write(VeriniceLinkTable vlt, String fullPath) {
        try {
            doWrite(vlt, fullPath);
        } catch (JsonParseException e) {
            String message = "Error while creating JSON for Link-Table configuration: " + vlt.getName();
            LOG.error(message, e);
            throw new LinkTableException(message, e);
        } catch (IOException e) {
            String message = "Error while writing Link-Table configuration to file: " + fullPath;
            LOG.error(message, e);
            throw new LinkTableException(message, e);
        }
    }

    /**
     * Reads a link table configuration from a VLT JSON file.
     *
     * @param fullPath The full path to the VLT JSON file
     * @return A link table configuration
     */
    public static VeriniceLinkTable read(String fullPath) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fullPath));
            return gson.fromJson(br, VeriniceLinkTable.class);
        } catch (JsonParseException e) {
            String message = "Parse error while reading JSON file for Link-Table configuration: " + fullPath;
            LOG.error(message, e);
            throw new LinkTableException(message, e);
        } catch (FileNotFoundException e) {
            String message = "JSON with Link-Table configuration not found: " + fullPath;
            LOG.error(message, e);
            throw new LinkTableException(message, e);
        }

    }

    /**
     * Reads a link table configuration from a VLT JSON file.
     *
     * @param fullPath The full path to the VLT JSON file
     * @return A link table configuration
     */
    public static ILinkTableConfiguration readLinkTableConfiguration(String fullPath) {
        return createLinkTableConfiguration(VeriniceLinkTableIO.read(fullPath));
    }

    /**
     * Creates a ILinkTableConfiguration from a {@link VeriniceLinkTable}
     *
     * @param vlr A link table
     * @return A link table configuration
     */
    public static ILinkTableConfiguration createLinkTableConfiguration(VeriniceLinkTable vlr) {
        Set<String> relationIds = (vlr.getRelationIds()!=null)
                ? new HashSet<>(vlr.getRelationIds())
                : null;
        Set<Integer> scopeIds = (vlr.getScopeIds()!=null)
                ? new HashSet<>(vlr.getScopeIds())
                : null;
        LinkTableConfiguration.Builder builder = new LinkTableConfiguration.Builder();
        return builder.setColumnPathes(new LinkedHashSet<>(vlr.getColumnPaths()))
        .setLinkTypeIds(relationIds)
        .setScopeIds(scopeIds).build();
    }

    private static void doWrite(VeriniceLinkTable vlt, String fullPath) throws IOException, JsonParseException {
        String json = gson.toJson(vlt);
        FileWriter writer = new FileWriter(fullPath);
        writer.write(json);
        writer.close();
    }

    private static VeriniceLinkTable createVeriniceLinkTable(ILinkTableConfiguration configuration, String name) {
        VeriniceLinkTable.Builder builder = new VeriniceLinkTable.Builder(name);
        builder.setColumnPaths(new LinkedList<>(configuration.getColumnPathes()));
        builder.setRelationIds(new LinkedList<>(configuration.getLinkTypeIds()));
        builder.setScopeIds(Arrays.asList(configuration.getScopeIdArray()));
        return builder.build();
    }
}

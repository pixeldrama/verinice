package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * StgNZobEsaId generated by hbm2java
 */
public class StgNZobEsaId implements java.io.Serializable {

	private Integer zobImpId;
	private Integer zobId;
	private Byte esaVorschlag;
	private Byte esaUnjId;
	private Byte esaEinsatz;
	private Byte esaModellierung;
	private String esaSzenario;
	private Date esaDatumErfasst;
	private Integer esaZobIdMit;
	private String esaEntscheidDurch;
	private String esaEntscheidEingetragen;
	private Date esaEntscheidDatum;
	private Date esaRaDatumBis;
	private String esaBegruendung;
	private String esaLink;
	private Byte impNeu;
	private String guid;
	private String guidOrg;
	private Integer usn;

	public StgNZobEsaId() {
	}

	public StgNZobEsaId(Integer zobImpId, Integer zobId, Byte esaVorschlag,
			Byte esaUnjId, Byte esaEinsatz, Byte esaModellierung,
			String esaSzenario, Date esaDatumErfasst, Integer esaZobIdMit,
			String esaEntscheidDurch, String esaEntscheidEingetragen,
			Date esaEntscheidDatum, Date esaRaDatumBis, String esaBegruendung,
			String esaLink, Byte impNeu, String guid, String guidOrg,
			Integer usn) {
		this.zobImpId = zobImpId;
		this.zobId = zobId;
		this.esaVorschlag = esaVorschlag;
		this.esaUnjId = esaUnjId;
		this.esaEinsatz = esaEinsatz;
		this.esaModellierung = esaModellierung;
		this.esaSzenario = esaSzenario;
		this.esaDatumErfasst = esaDatumErfasst;
		this.esaZobIdMit = esaZobIdMit;
		this.esaEntscheidDurch = esaEntscheidDurch;
		this.esaEntscheidEingetragen = esaEntscheidEingetragen;
		this.esaEntscheidDatum = esaEntscheidDatum;
		this.esaRaDatumBis = esaRaDatumBis;
		this.esaBegruendung = esaBegruendung;
		this.esaLink = esaLink;
		this.impNeu = impNeu;
		this.guid = guid;
		this.guidOrg = guidOrg;
		this.usn = usn;
	}

	public Integer getZobImpId() {
		return this.zobImpId;
	}

	public void setZobImpId(Integer zobImpId) {
		this.zobImpId = zobImpId;
	}

	public Integer getZobId() {
		return this.zobId;
	}

	public void setZobId(Integer zobId) {
		this.zobId = zobId;
	}

	public Byte getEsaVorschlag() {
		return this.esaVorschlag;
	}

	public void setEsaVorschlag(Byte esaVorschlag) {
		this.esaVorschlag = esaVorschlag;
	}

	public Byte getEsaUnjId() {
		return this.esaUnjId;
	}

	public void setEsaUnjId(Byte esaUnjId) {
		this.esaUnjId = esaUnjId;
	}

	public Byte getEsaEinsatz() {
		return this.esaEinsatz;
	}

	public void setEsaEinsatz(Byte esaEinsatz) {
		this.esaEinsatz = esaEinsatz;
	}

	public Byte getEsaModellierung() {
		return this.esaModellierung;
	}

	public void setEsaModellierung(Byte esaModellierung) {
		this.esaModellierung = esaModellierung;
	}

	public String getEsaSzenario() {
		return this.esaSzenario;
	}

	public void setEsaSzenario(String esaSzenario) {
		this.esaSzenario = esaSzenario;
	}

	public Date getEsaDatumErfasst() {
		return this.esaDatumErfasst;
	}

	public void setEsaDatumErfasst(Date esaDatumErfasst) {
		this.esaDatumErfasst = esaDatumErfasst;
	}

	public Integer getEsaZobIdMit() {
		return this.esaZobIdMit;
	}

	public void setEsaZobIdMit(Integer esaZobIdMit) {
		this.esaZobIdMit = esaZobIdMit;
	}

	public String getEsaEntscheidDurch() {
		return this.esaEntscheidDurch;
	}

	public void setEsaEntscheidDurch(String esaEntscheidDurch) {
		this.esaEntscheidDurch = esaEntscheidDurch;
	}

	public String getEsaEntscheidEingetragen() {
		return this.esaEntscheidEingetragen;
	}

	public void setEsaEntscheidEingetragen(String esaEntscheidEingetragen) {
		this.esaEntscheidEingetragen = esaEntscheidEingetragen;
	}

	public Date getEsaEntscheidDatum() {
		return this.esaEntscheidDatum;
	}

	public void setEsaEntscheidDatum(Date esaEntscheidDatum) {
		this.esaEntscheidDatum = esaEntscheidDatum;
	}

	public Date getEsaRaDatumBis() {
		return this.esaRaDatumBis;
	}

	public void setEsaRaDatumBis(Date esaRaDatumBis) {
		this.esaRaDatumBis = esaRaDatumBis;
	}

	public String getEsaBegruendung() {
		return this.esaBegruendung;
	}

	public void setEsaBegruendung(String esaBegruendung) {
		this.esaBegruendung = esaBegruendung;
	}

	public String getEsaLink() {
		return this.esaLink;
	}

	public void setEsaLink(String esaLink) {
		this.esaLink = esaLink;
	}

	public Byte getImpNeu() {
		return this.impNeu;
	}

	public void setImpNeu(Byte impNeu) {
		this.impNeu = impNeu;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getGuidOrg() {
		return this.guidOrg;
	}

	public void setGuidOrg(String guidOrg) {
		this.guidOrg = guidOrg;
	}

	public Integer getUsn() {
		return this.usn;
	}

	public void setUsn(Integer usn) {
		this.usn = usn;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof StgNZobEsaId))
			return false;
		StgNZobEsaId castOther = (StgNZobEsaId) other;

		return ((this.getZobImpId() == castOther.getZobImpId()) || (this
				.getZobImpId() != null && castOther.getZobImpId() != null && this
				.getZobImpId().equals(castOther.getZobImpId())))
				&& ((this.getZobId() == castOther.getZobId()) || (this
						.getZobId() != null && castOther.getZobId() != null && this
						.getZobId().equals(castOther.getZobId())))
				&& ((this.getEsaVorschlag() == castOther.getEsaVorschlag()) || (this
						.getEsaVorschlag() != null
						&& castOther.getEsaVorschlag() != null && this
						.getEsaVorschlag().equals(castOther.getEsaVorschlag())))
				&& ((this.getEsaUnjId() == castOther.getEsaUnjId()) || (this
						.getEsaUnjId() != null
						&& castOther.getEsaUnjId() != null && this
						.getEsaUnjId().equals(castOther.getEsaUnjId())))
				&& ((this.getEsaEinsatz() == castOther.getEsaEinsatz()) || (this
						.getEsaEinsatz() != null
						&& castOther.getEsaEinsatz() != null && this
						.getEsaEinsatz().equals(castOther.getEsaEinsatz())))
				&& ((this.getEsaModellierung() == castOther
						.getEsaModellierung()) || (this.getEsaModellierung() != null
						&& castOther.getEsaModellierung() != null && this
						.getEsaModellierung().equals(
								castOther.getEsaModellierung())))
				&& ((this.getEsaSzenario() == castOther.getEsaSzenario()) || (this
						.getEsaSzenario() != null
						&& castOther.getEsaSzenario() != null && this
						.getEsaSzenario().equals(castOther.getEsaSzenario())))
				&& ((this.getEsaDatumErfasst() == castOther
						.getEsaDatumErfasst()) || (this.getEsaDatumErfasst() != null
						&& castOther.getEsaDatumErfasst() != null && this
						.getEsaDatumErfasst().equals(
								castOther.getEsaDatumErfasst())))
				&& ((this.getEsaZobIdMit() == castOther.getEsaZobIdMit()) || (this
						.getEsaZobIdMit() != null
						&& castOther.getEsaZobIdMit() != null && this
						.getEsaZobIdMit().equals(castOther.getEsaZobIdMit())))
				&& ((this.getEsaEntscheidDurch() == castOther
						.getEsaEntscheidDurch()) || (this
						.getEsaEntscheidDurch() != null
						&& castOther.getEsaEntscheidDurch() != null && this
						.getEsaEntscheidDurch().equals(
								castOther.getEsaEntscheidDurch())))
				&& ((this.getEsaEntscheidEingetragen() == castOther
						.getEsaEntscheidEingetragen()) || (this
						.getEsaEntscheidEingetragen() != null
						&& castOther.getEsaEntscheidEingetragen() != null && this
						.getEsaEntscheidEingetragen().equals(
								castOther.getEsaEntscheidEingetragen())))
				&& ((this.getEsaEntscheidDatum() == castOther
						.getEsaEntscheidDatum()) || (this
						.getEsaEntscheidDatum() != null
						&& castOther.getEsaEntscheidDatum() != null && this
						.getEsaEntscheidDatum().equals(
								castOther.getEsaEntscheidDatum())))
				&& ((this.getEsaRaDatumBis() == castOther.getEsaRaDatumBis()) || (this
						.getEsaRaDatumBis() != null
						&& castOther.getEsaRaDatumBis() != null && this
						.getEsaRaDatumBis()
						.equals(castOther.getEsaRaDatumBis())))
				&& ((this.getEsaBegruendung() == castOther.getEsaBegruendung()) || (this
						.getEsaBegruendung() != null
						&& castOther.getEsaBegruendung() != null && this
						.getEsaBegruendung().equals(
								castOther.getEsaBegruendung())))
				&& ((this.getEsaLink() == castOther.getEsaLink()) || (this
						.getEsaLink() != null && castOther.getEsaLink() != null && this
						.getEsaLink().equals(castOther.getEsaLink())))
				&& ((this.getImpNeu() == castOther.getImpNeu()) || (this
						.getImpNeu() != null && castOther.getImpNeu() != null && this
						.getImpNeu().equals(castOther.getImpNeu())))
				&& ((this.getGuid() == castOther.getGuid()) || (this.getGuid() != null
						&& castOther.getGuid() != null && this.getGuid()
						.equals(castOther.getGuid())))
				&& ((this.getGuidOrg() == castOther.getGuidOrg()) || (this
						.getGuidOrg() != null && castOther.getGuidOrg() != null && this
						.getGuidOrg().equals(castOther.getGuidOrg())))
				&& ((this.getUsn() == castOther.getUsn()) || (this.getUsn() != null
						&& castOther.getUsn() != null && this.getUsn().equals(
						castOther.getUsn())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getZobImpId() == null ? 0 : this.getZobImpId().hashCode());
		result = 37 * result
				+ (getZobId() == null ? 0 : this.getZobId().hashCode());
		result = 37
				* result
				+ (getEsaVorschlag() == null ? 0 : this.getEsaVorschlag()
						.hashCode());
		result = 37 * result
				+ (getEsaUnjId() == null ? 0 : this.getEsaUnjId().hashCode());
		result = 37
				* result
				+ (getEsaEinsatz() == null ? 0 : this.getEsaEinsatz()
						.hashCode());
		result = 37
				* result
				+ (getEsaModellierung() == null ? 0 : this.getEsaModellierung()
						.hashCode());
		result = 37
				* result
				+ (getEsaSzenario() == null ? 0 : this.getEsaSzenario()
						.hashCode());
		result = 37
				* result
				+ (getEsaDatumErfasst() == null ? 0 : this.getEsaDatumErfasst()
						.hashCode());
		result = 37
				* result
				+ (getEsaZobIdMit() == null ? 0 : this.getEsaZobIdMit()
						.hashCode());
		result = 37
				* result
				+ (getEsaEntscheidDurch() == null ? 0 : this
						.getEsaEntscheidDurch().hashCode());
		result = 37
				* result
				+ (getEsaEntscheidEingetragen() == null ? 0 : this
						.getEsaEntscheidEingetragen().hashCode());
		result = 37
				* result
				+ (getEsaEntscheidDatum() == null ? 0 : this
						.getEsaEntscheidDatum().hashCode());
		result = 37
				* result
				+ (getEsaRaDatumBis() == null ? 0 : this.getEsaRaDatumBis()
						.hashCode());
		result = 37
				* result
				+ (getEsaBegruendung() == null ? 0 : this.getEsaBegruendung()
						.hashCode());
		result = 37 * result
				+ (getEsaLink() == null ? 0 : this.getEsaLink().hashCode());
		result = 37 * result
				+ (getImpNeu() == null ? 0 : this.getImpNeu().hashCode());
		result = 37 * result
				+ (getGuid() == null ? 0 : this.getGuid().hashCode());
		result = 37 * result
				+ (getGuidOrg() == null ? 0 : this.getGuidOrg().hashCode());
		result = 37 * result
				+ (getUsn() == null ? 0 : this.getUsn().hashCode());
		return result;
	}

}

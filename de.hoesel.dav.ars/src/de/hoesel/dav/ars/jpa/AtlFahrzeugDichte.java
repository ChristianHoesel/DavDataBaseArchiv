package de.hoesel.dav.ars.jpa;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import de.bsvrz.dav.daf.main.Data;

@Entity
public class AtlFahrzeugDichte {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long db_id;

	private Short wert;

	@Embedded
	private AtlStatus status;

	@Embedded
	private AtlG�te g�te;

	public AtlFahrzeugDichte() {

	}

	public AtlFahrzeugDichte(Data item) {
		setWert(item.getUnscaledValue("Wert").shortValue());
		setStatus(new AtlStatus(item.getItem("Status")));
		setG�te(new AtlG�te(item.getItem("G�te")));
	}
	
	

	public Long getDb_id() {
		return db_id;
	}

	public void setDb_id(Long db_id) {
		this.db_id = db_id;
	}

	public Short getWert() {
		return wert;
	}

	public void setWert(Short wert) {
		this.wert = wert;
	}

	public AtlStatus getStatus() {
		return status;
	}

	public void setStatus(AtlStatus status) {
		this.status = status;
	}

	public AtlG�te getG�te() {
		return g�te;
	}

	public void setG�te(AtlG�te g�te) {
		this.g�te = g�te;
	}
}

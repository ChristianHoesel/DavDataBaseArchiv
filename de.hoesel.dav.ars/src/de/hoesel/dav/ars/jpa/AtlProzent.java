package de.hoesel.dav.ars.jpa;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import de.bsvrz.dav.daf.main.Data;

@Entity
public class AtlProzent {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long db_id;
	
	private Integer wert;
	
	@Embedded
	private AtlStatus status;
	
	@Embedded
	private AtlG�te guete;
	
	public AtlProzent(){
		
	}
	
	public AtlProzent(Data item) {
		setWert(item.getUnscaledValue("Wert").intValue());
		setStatus(new AtlStatus(item.getItem("Status")));
		setG�te(new AtlG�te(item.getItem("G�te")));
	}

	public Integer getWert() {
		return wert;
	}

	public void setWert(Integer wert) {
		this.wert = wert;
	}

	public AtlStatus getStatus() {
		return status;
	}

	public void setStatus(AtlStatus status) {
		this.status = status;
	}

	public AtlG�te getG�te() {
		return guete;
	}

	public void setG�te(AtlG�te g�te) {
		this.guete = g�te;
	}
}

package de.hoesel.dav.ars.jpa;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import de.bsvrz.dav.daf.main.Data;

@Entity
public class AtlG�te {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long db_id;
	
	private Float g�teIndex;
	
	private String verfahren;

	public AtlG�te(){
		
	}
	
	public AtlG�te(Data item) {
		setIndex(item.getUnscaledValue("Index").floatValue());
		setVerfahren(item.getTextValue("Verfahren").getText());
	}

	public Float getIndex() {
		return g�teIndex;
	}

	public void setIndex(Float index) {
		this.g�teIndex = index;
	}

	public String getVerfahren() {
		return verfahren;
	}

	public void setVerfahren(String verfahren) {
		this.verfahren = verfahren;
	}

}

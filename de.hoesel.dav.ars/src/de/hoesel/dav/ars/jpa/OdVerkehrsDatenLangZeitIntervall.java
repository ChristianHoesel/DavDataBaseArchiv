package de.hoesel.dav.ars.jpa;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import de.bsvrz.dav.daf.main.Data;
import de.bsvrz.dav.daf.main.ResultData;

@Entity
public class OdVerkehrsDatenLangZeitIntervall implements Serializable,
		DatenverteilerArchivDatensatz {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long db_id;

	private SystemObjectArchiv systemObject;

	private String aspect;
	
	private AtlVerkehrsSt�rkeStunde qKfz;
	
	private AtlVerkehrsSt�rkeStunde qPkw�;
	
	private AtlVerkehrsSt�rkeStunde qKfzNk;
	
	private AtlVerkehrsSt�rkeStunde qPkwG;
	
	private AtlVerkehrsSt�rkeStunde qPkw;
	
	private AtlVerkehrsSt�rkeStunde qKrad;
	
	private AtlVerkehrsSt�rkeStunde qLfw;
	
	private AtlVerkehrsSt�rkeStunde qLkw�;
	
	private AtlVerkehrsSt�rkeStunde qPkwA;
	
	private AtlVerkehrsSt�rkeStunde qLkw;
	
	private AtlVerkehrsSt�rkeStunde qBus;
	
	private AtlVerkehrsSt�rkeStunde qLkwK;
	
	private AtlVerkehrsSt�rkeStunde qSattelKfz;
	
	private AtlGeschwindigkeit vKfz;
	
	private AtlGeschwindigkeit vPkw�;
	
	private AtlGeschwindigkeit vKfzNk;
	
	private AtlGeschwindigkeit vPkwG;
	
	private AtlGeschwindigkeit vPkw;
	
	private AtlGeschwindigkeit vKrad;
	
	private AtlGeschwindigkeit vLfw;
	
	private AtlGeschwindigkeit vLkw�;
	
	private AtlGeschwindigkeit vPkwA;
	
	private AtlGeschwindigkeit vLkw;
	
	private AtlGeschwindigkeit vBus;
	
	private AtlGeschwindigkeit vLkwK;
	
	private AtlGeschwindigkeit vLkwA;
	
	private AtlGeschwindigkeit vSattelKfz;
	
	
	public OdVerkehrsDatenLangZeitIntervall(){
		
	}
	
	public OdVerkehrsDatenLangZeitIntervall(ResultData rd){
		
		setSystemObject(new SystemObjectArchiv(rd.getObject()));
		setAspect(rd.getDataDescription().getAspect().getPid());
		setTimestamp(new Date(rd.getDataTime()));

		Data daten = rd.getData();
		if (daten != null) {
			setqKfz(new AtlVerkehrsSt�rkeStunde(daten.getItem("qKfz")));
			setqPkw�(new AtlVerkehrsSt�rkeStunde(daten.getItem("qPkw�")));
			setqKfzNk(new AtlVerkehrsSt�rkeStunde(daten.getItem("qKfzNk")));
			setqPkwG(new AtlVerkehrsSt�rkeStunde(daten.getItem("qPkwG")));
			setqPkw(new AtlVerkehrsSt�rkeStunde(daten.getItem("qPkw")));
			setqKrad(new AtlVerkehrsSt�rkeStunde(daten.getItem("qKrad")));
			setqLfw(new AtlVerkehrsSt�rkeStunde(daten.getItem("qLfw")));
			setqLkw�(new AtlVerkehrsSt�rkeStunde(daten.getItem("qLkw�")));
			setqPkwA(new AtlVerkehrsSt�rkeStunde(daten.getItem("qPkwA")));
			setqLkw(new AtlVerkehrsSt�rkeStunde(daten.getItem("qLkw")));
			setqBus(new AtlVerkehrsSt�rkeStunde(daten.getItem("qBus")));
			setqLkwK(new AtlVerkehrsSt�rkeStunde(daten.getItem("qLkwK")));
			setqSattelKfz(new AtlVerkehrsSt�rkeStunde(daten.getItem("qSattelKfz")));
			
			setvKfz(new AtlGeschwindigkeit(daten.getItem("vKfz")));
			setvPkw�(new AtlGeschwindigkeit(daten.getItem("vPkw�")));
			setvKfzNk(new AtlGeschwindigkeit(daten.getItem("vKfzNk")));
			setvPkwG(new AtlGeschwindigkeit(daten.getItem("vPkwG")));
			setvPkw(new AtlGeschwindigkeit(daten.getItem("vPkw")));
			setvKrad(new AtlGeschwindigkeit(daten.getItem("vKrad")));
			setvLfw(new AtlGeschwindigkeit(daten.getItem("vLfw")));
			setvLkw�(new AtlGeschwindigkeit(daten.getItem("vLkw�")));
			setvPkwA(new AtlGeschwindigkeit(daten.getItem("vPkwA")));
			setvLkw(new AtlGeschwindigkeit(daten.getItem("vLkw")));
			setvBus(new AtlGeschwindigkeit(daten.getItem("vBus")));
			setvLkwK(new AtlGeschwindigkeit(daten.getItem("vLkwK")));
			setvSattelKfz(new AtlGeschwindigkeit(daten.getItem("vSattelKfz")));
		}
	}

	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	@Override
	public Date getTimestamp() {
		return timestamp;
	}

	@Override
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;

	}

	@Override
	public SystemObjectArchiv getSystemObject() {
		return systemObject;
	}

	@Override
	public void setSystemObject(SystemObjectArchiv systemObject) {
		this.systemObject = systemObject;

	}

	public String getAspect() {
		return aspect;
	}

	public void setAspect(String aspect) {
		this.aspect = aspect;
	}

	public AtlVerkehrsSt�rkeStunde getqKfz() {
		return qKfz;
	}

	public void setqKfz(AtlVerkehrsSt�rkeStunde qKfz) {
		this.qKfz = qKfz;
	}

	public AtlVerkehrsSt�rkeStunde getqPkw�() {
		return qPkw�;
	}

	public void setqPkw�(AtlVerkehrsSt�rkeStunde qPkw�) {
		this.qPkw� = qPkw�;
	}

	public AtlVerkehrsSt�rkeStunde getqKfzNk() {
		return qKfzNk;
	}

	public void setqKfzNk(AtlVerkehrsSt�rkeStunde qKfzNk) {
		this.qKfzNk = qKfzNk;
	}

	public AtlVerkehrsSt�rkeStunde getqPkwG() {
		return qPkwG;
	}

	public void setqPkwG(AtlVerkehrsSt�rkeStunde qPkwG) {
		this.qPkwG = qPkwG;
	}

	public Long getDb_id() {
		return db_id;
	}

	public void setDb_id(Long db_id) {
		this.db_id = db_id;
	}

	public AtlVerkehrsSt�rkeStunde getqPkw() {
		return qPkw;
	}

	public void setqPkw(AtlVerkehrsSt�rkeStunde qPkw) {
		this.qPkw = qPkw;
	}

	public AtlVerkehrsSt�rkeStunde getqKrad() {
		return qKrad;
	}

	public void setqKrad(AtlVerkehrsSt�rkeStunde qKrad) {
		this.qKrad = qKrad;
	}

	public AtlVerkehrsSt�rkeStunde getqLfw() {
		return qLfw;
	}

	public void setqLfw(AtlVerkehrsSt�rkeStunde qLfw) {
		this.qLfw = qLfw;
	}

	public AtlVerkehrsSt�rkeStunde getqLkw�() {
		return qLkw�;
	}

	public void setqLkw�(AtlVerkehrsSt�rkeStunde qLkw�) {
		this.qLkw� = qLkw�;
	}

	public AtlVerkehrsSt�rkeStunde getqPkwA() {
		return qPkwA;
	}

	public void setqPkwA(AtlVerkehrsSt�rkeStunde qPkwA) {
		this.qPkwA = qPkwA;
	}

	public AtlVerkehrsSt�rkeStunde getqLkw() {
		return qLkw;
	}

	public void setqLkw(AtlVerkehrsSt�rkeStunde qLkw) {
		this.qLkw = qLkw;
	}

	public AtlVerkehrsSt�rkeStunde getqBus() {
		return qBus;
	}

	public void setqBus(AtlVerkehrsSt�rkeStunde qBus) {
		this.qBus = qBus;
	}

	public AtlVerkehrsSt�rkeStunde getqLkwK() {
		return qLkwK;
	}

	public void setqLkwK(AtlVerkehrsSt�rkeStunde qLkwK) {
		this.qLkwK = qLkwK;
	}

	public AtlVerkehrsSt�rkeStunde getqSattelKfz() {
		return qSattelKfz;
	}

	public void setqSattelKfz(AtlVerkehrsSt�rkeStunde qSattelKfz) {
		this.qSattelKfz = qSattelKfz;
	}

	public AtlGeschwindigkeit getvKfz() {
		return vKfz;
	}

	public void setvKfz(AtlGeschwindigkeit vKfz) {
		this.vKfz = vKfz;
	}

	public AtlGeschwindigkeit getvPkw�() {
		return vPkw�;
	}

	public void setvPkw�(AtlGeschwindigkeit vPkw�) {
		this.vPkw� = vPkw�;
	}

	public AtlGeschwindigkeit getvKfzNk() {
		return vKfzNk;
	}

	public void setvKfzNk(AtlGeschwindigkeit vKfzNk) {
		this.vKfzNk = vKfzNk;
	}

	public AtlGeschwindigkeit getvPkwG() {
		return vPkwG;
	}

	public void setvPkwG(AtlGeschwindigkeit vPkwG) {
		this.vPkwG = vPkwG;
	}

	public AtlGeschwindigkeit getvPkw() {
		return vPkw;
	}

	public void setvPkw(AtlGeschwindigkeit vPkw) {
		this.vPkw = vPkw;
	}

	public AtlGeschwindigkeit getvKrad() {
		return vKrad;
	}

	public void setvKrad(AtlGeschwindigkeit vKrad) {
		this.vKrad = vKrad;
	}

	public AtlGeschwindigkeit getvLfw() {
		return vLfw;
	}

	public void setvLfw(AtlGeschwindigkeit vLfw) {
		this.vLfw = vLfw;
	}

	public AtlGeschwindigkeit getvLkw�() {
		return vLkw�;
	}

	public void setvLkw�(AtlGeschwindigkeit vLkw�) {
		this.vLkw� = vLkw�;
	}

	public AtlGeschwindigkeit getvPkwA() {
		return vPkwA;
	}

	public void setvPkwA(AtlGeschwindigkeit vPkwA) {
		this.vPkwA = vPkwA;
	}

	public AtlGeschwindigkeit getvLkw() {
		return vLkw;
	}

	public void setvLkw(AtlGeschwindigkeit vLkw) {
		this.vLkw = vLkw;
	}

	public AtlGeschwindigkeit getvBus() {
		return vBus;
	}

	public void setvBus(AtlGeschwindigkeit vBus) {
		this.vBus = vBus;
	}

	public AtlGeschwindigkeit getvLkwK() {
		return vLkwK;
	}

	public void setvLkwK(AtlGeschwindigkeit vLkwK) {
		this.vLkwK = vLkwK;
	}

	public AtlGeschwindigkeit getvLkwA() {
		return vLkwA;
	}

	public void setvLkwA(AtlGeschwindigkeit vLkwA) {
		this.vLkwA = vLkwA;
	}

	public AtlGeschwindigkeit getvSattelKfz() {
		return vSattelKfz;
	}

	public void setvSattelKfz(AtlGeschwindigkeit vSattelKfz) {
		this.vSattelKfz = vSattelKfz;
	}

}

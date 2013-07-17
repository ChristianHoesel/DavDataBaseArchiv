package de.hoesel.dav.ars.jpa;

import java.util.Date;

/**
 * Schnittstelle, die alle konkreten Archidatens�tze implementieren m�ssen.
 * 
 * @author Christian
 * 
 */
public interface DatenverteilerArchivDatensatz {

	Date getTimestamp();

	void setTimestamp(Date timestamp);

	SystemObjectArchiv getSystemObject();

	void setSystemObject(SystemObjectArchiv systemObject);

}
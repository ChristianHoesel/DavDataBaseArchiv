package de.hoesel.dav.ars.jpa.convert;

import org.eclipse.persistence.mappings.DatabaseMapping;
import org.eclipse.persistence.mappings.converters.Converter;
import org.eclipse.persistence.sessions.Session;

import de.bsvrz.dav.daf.main.config.Aspect;
import de.hoesel.dav.ars.Archiv;


public class AspectConverter implements Converter{

	@Override
	public Object convertObjectValueToDataValue(Object objectValue,
			Session session) {
		return ((Aspect)objectValue).getPid();
	}

	@Override
	public Object convertDataValueToObjectValue(Object dataValue,
			Session session) {
		return Archiv.getDavConnection().getDataModel().getAspect(dataValue.toString());
	}

	@Override
	public boolean isMutable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void initialize(DatabaseMapping mapping, Session session) {
		// TODO Auto-generated method stub
		
	}


}

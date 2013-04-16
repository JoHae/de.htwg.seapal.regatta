package de.htwg.seapal.regatta.app;

import com.google.inject.AbstractModule;

import de.htwg.seapal.regatta.controllers.IRegattaController;
import de.htwg.seapal.regatta.database.IRegattaDatabase;
import de.htwg.seapal.regatta.models.IRegatta;



public class RegattaDemoImplModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IRegatta.class).to(de.htwg.seapal.regatta.models.impl.Regatta.class);
		bind(IRegattaController.class).to(de.htwg.seapal.regatta.controllers.impl.RegattaController.class);	
		bind(IRegattaDatabase.class).to(de.htwg.seapal.regatta.database.impl.RegattaHashMapDatabase.class);
	}
}

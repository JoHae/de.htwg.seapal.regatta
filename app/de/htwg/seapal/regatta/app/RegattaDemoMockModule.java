package de.htwg.seapal.regatta.app;

import com.google.inject.AbstractModule;

import de.htwg.seapal.regatta.controllers.IRegattaController;
import de.htwg.seapal.regatta.database.IRegattaDatabase;
import de.htwg.seapal.regatta.models.IRegatta;



public class RegattaDemoMockModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IRegatta.class).to(de.htwg.seapal.regatta.models.mock.Regatta.class);
		bind(IRegattaController.class).to(de.htwg.seapal.regatta.controllers.mock.RegattaController.class);	
		bind(IRegattaDatabase.class).to(de.htwg.seapal.regatta.database.mock.RegattaHashMapDatabase.class);
	}
}

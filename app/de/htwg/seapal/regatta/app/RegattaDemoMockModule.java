package de.htwg.seapal.regatta.app;

import com.google.inject.AbstractModule;

import de.htwg.seapal.boat.controllers.IBoatController;
import de.htwg.seapal.boat.database.IBoatDatabase;
import de.htwg.seapal.boat.models.IBoat;
import de.htwg.seapal.person.controllers.IPersonController;
import de.htwg.seapal.person.database.IPersonDatabase;
import de.htwg.seapal.person.models.IPerson;
import de.htwg.seapal.regatta.controllers.IRegattaController;
import de.htwg.seapal.regatta.database.IRegattaDatabase;
import de.htwg.seapal.regatta.models.IRegatta;

public class RegattaDemoMockModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IRegatta.class).to(de.htwg.seapal.regatta.models.mock.Regatta.class);
		bind(IRegattaController.class).to(de.htwg.seapal.regatta.controllers.mock.RegattaController.class);
		bind(IRegattaDatabase.class).to(de.htwg.seapal.regatta.database.mock.RegattaDatabase.class);
		
		bind(IBoatController.class).to(de.htwg.seapal.boat.controllers.mock.BoatController.class);
		bind(IBoat.class).to(de.htwg.seapal.boat.models.mock.Boat.class);
		bind(IBoatDatabase.class).to(de.htwg.seapal.boat.database.impl.BoatEbeanDatabase.class);
		
		bind(IPersonController.class).to(de.htwg.seapal.person.controllers.mock.PersonController.class);
		bind(IPerson.class).to(de.htwg.seapal.person.models.mock.Person.class);
		bind(IPersonDatabase.class).to(de.htwg.seapal.person.database.mock.PersonDatabase.class);
	}
}

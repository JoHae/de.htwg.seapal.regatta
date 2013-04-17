package de.htwg.seapal.regatta.controllers.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.boat.controllers.IBoatController;
import de.htwg.seapal.regatta.controllers.AbstractRegattaController;

@Singleton
public class RegattaController extends AbstractRegattaController {
	@Inject
	public RegattaController(IBoatController boatController) {
		
	}
}

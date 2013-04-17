package de.htwg.seapal.regatta.controllers.impl;

import java.util.Map;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.regatta.controllers.AbstractRegattaController;

@Singleton
public class RegattaController extends AbstractRegattaController {
	@Inject
	public RegattaController() {}

	@Override
	public Map<String, String> getRegattaList() {
		// TODO Auto-generated method stub
		return null;
	}

}

package de.htwg.seapal.regatta.controllers.impl;

import java.util.Map;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.regatta.controllers.AbstractRegattaController;
import de.htwg.seapal.regatta.models.IRegatta;

@Singleton
public class RegattaController extends AbstractRegattaController {
	@Inject
	public RegattaController(IRegatta regatta) {}

	@Override
	public Map<String, String> getRegattaList() {
		return null;
	}
}

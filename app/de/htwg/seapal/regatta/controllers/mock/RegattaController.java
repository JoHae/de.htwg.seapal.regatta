package de.htwg.seapal.regatta.controllers.mock;

import java.util.LinkedList;
import java.util.List;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.regatta.controllers.AbstractRegattaController;

@Singleton
public class RegattaController extends AbstractRegattaController {
	
	@Inject
	public RegattaController() {
	}
	
	@Override
	public List<String> getRegattaIds() {
		
		List<String> regattaMap = new LinkedList<String>();
		regattaMap.add("Regatta-1");
		regattaMap.add("Regatta-2");
		regattaMap.add("Regatta-3");
		
		return regattaMap;
	}
	
	@Override
	public String getRegattaName(String regattaId) {
		return "Testregatta";
	}

	@Override
	public void setRegattaName(String regattaId,String name) {}

	@Override
	public String getRegattaHost(String regattaId) {
		return "Yachtclub";
	}

	@Override
	public void setRegattaHost(String regattaId, String host) {}
}

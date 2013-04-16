package de.htwg.seapal.regatta.controllers.mock;

import java.util.HashMap;
import java.util.Map;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.regatta.controllers.AbstractRegattaController;

@Singleton
public class RegattaController extends AbstractRegattaController {
	
	@Inject
	public RegattaController() {
	}
	
	@Override
	public Map<String, String> getRegattaList() {
		
		Map<String,String> regattaMap = new HashMap<String,String>();
		regattaMap.put("Regatta-1", "Testregatta Yachtclub");
		regattaMap.put("Regatta-2", "Rundfahrt Peter");
		regattaMap.put("Regatta-3", "Abcdefg Mr.Wollowitz");
		
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

package de.htwg.seapal.regatta.controllers.mock;

import java.util.HashMap;
import java.util.Map;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import de.htwg.seapal.regatta.controllers.AbstractRegattaController;
import de.htwg.seapal.regatta.models.IRegatta;

@Singleton
public class RegattaController extends AbstractRegattaController {
	
	@Inject
	public RegattaController(IRegatta regatta) {
	}
	
	@Override
	public Map<String, String> getRegattaList() {
		
		Map<String,String> RegattaMap = new HashMap<String,String>();
		RegattaMap.put("Regatta-1", "Testregatta Yachtclub");
		RegattaMap.put("Regatta-2", "Rundfahrt Peter");
		RegattaMap.put("Regatta-3", "Abcdefg Mr.Wollowitz");
		
		return RegattaMap;
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

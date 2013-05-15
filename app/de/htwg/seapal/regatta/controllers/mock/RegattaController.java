package de.htwg.seapal.regatta.controllers.mock;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import de.htwg.seapal.regatta.controllers.IRegattaController;
import de.htwg.seapal.regatta.util.observer.Observable;

@Singleton
public class RegattaController extends Observable implements IRegattaController {
	
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

	@Override
	public void addRegatta(String regattaId) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteRegattaById(String regattaId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getRegattaString(String regattaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRegattaEstimatedStartTime(String regattaId, Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date getRegattaEstimatedStartTime(String regattaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRegattaEstimatedFinishTime(String regattaId, Date date) {
		// TODO Auto-generated method stub
	}

	@Override
	public Date getRegattaEstimatedFinishTime(String regattaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRegattaRealStartTime(String regattaId, Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date getRegattaRealStartTime(String regattaId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRegattaRealFinishTime(String regattaId, Date date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Date getRegattaRealFinishTime(String regattaId) {
		// TODO Auto-generated method stub
		return null;
	}
}

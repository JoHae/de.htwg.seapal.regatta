package de.htwg.seapal.regatta.models.mock;

import java.util.Date;
import java.util.List;

import de.htwg.seapal.regatta.models.AbstractRegatta;

public class Regatta extends AbstractRegatta {

	public String getId() {
		return "REGATTA-1";
	}
	
	public void setId(String id) {}
	
	public String getName() {
		return "In 80 Tagen um den See";
	}

	public void setName(String name) {}

	public String getHost() {
		return "Yachtclub Hulk Hogan";
	}

	public void setHost(String host) {}

	@Override
	public Date getEstimatedStartTime() {
		return new Date();
	}

	@Override
	public void setEstimatedStartTime(Date date) {}

	@Override
	public Date getEstimatedFinishTime() {
		return new Date();
	}

	@Override
	public void setEstimatedFinishTime(Date date) {}

	@Override
	public Date getRealStartTime() {
		return new Date();
	}

	@Override
	public void setRealStartTime(Date date) {}

	@Override
	public Date getRealFinishTime() {
		return new Date();
	}

	@Override
	public void setRealFinishTime(Date date) {}

	@Override
	public List<String> getBoatIds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addBoat(String boatId) {
		// TODO Auto-generated method stub
		
	}

}

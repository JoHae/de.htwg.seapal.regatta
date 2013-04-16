package de.htwg.seapal.regatta.models.mock;

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
}

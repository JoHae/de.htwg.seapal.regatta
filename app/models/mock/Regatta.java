package models.mock;

import models.IRegatta;

public class Regatta implements IRegatta{

	@Override
	public String getName() {
		return "In 80 Tagen um den See";
	}

	@Override
	public void setName(String name) {
				
	}

	@Override
	public String getHost() {
		return "Hulk Hogan";
	}

	@Override
	public void setHost(String host) {
		
	}
//	
//	@Override
//	public Set getPeople() {
//		return "Hulk Hogan";
//	}
//
//	@Override
//	public void setP(String host) {
//		
//	}
	
}

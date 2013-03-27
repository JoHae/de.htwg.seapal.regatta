package models.impl;

import models.IRegatta;

public class Regatta implements IRegatta{

	private String name = "n.a.";
	private String host = "n.a.";

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getHost() {
		return this.host;
	}

	@Override
	public void setHost(String host) {
		this.host = host;
	}
}

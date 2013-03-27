package models.impl;

import models.IRegatta;

public class Regatta implements IRegatta{

	private String name="n.a.";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

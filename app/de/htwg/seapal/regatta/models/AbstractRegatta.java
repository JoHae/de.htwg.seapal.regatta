package de.htwg.seapal.regatta.models;

public abstract class AbstractRegatta implements IRegatta {

	private String id = null;

	private String name = null;
	private String host = null;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n");
		sb.append("ID:\t").append(this.getId()).append("\n");
		sb.append("Name:\t").append(this.getName()).append("\n");
		sb.append("Host:\t").append(this.getHost()).append("\n");

		sb.append("\n");
		
		return sb.toString();
	}
}

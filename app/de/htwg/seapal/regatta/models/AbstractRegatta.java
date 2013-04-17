package de.htwg.seapal.regatta.models;

import java.util.Date;

public abstract class AbstractRegatta implements IRegatta {

	private String id = null;

	private String name = null;
	private String host = null;
	private Date estimatedStartTime = null;
	private Date estimatedFinishTime = null;
	private Date realStartTime = null;
	private Date realFinishTime = null;
	
	public Date getEstimatedStartTime() {
		return estimatedStartTime;
	}
	
	public void setEstimatedStartTime(Date d) {
		this.estimatedStartTime = d;
	}
	
	public Date getEstimatedFinishTime() {
		return estimatedFinishTime;
	}
	
	public void setEstimatedFinishTime(Date d) {
		this.estimatedFinishTime = d;
	}
	
	public Date getRealStartTime() {
		return realStartTime;
	}
	public void setRealStartTime(Date d) {
		this.realStartTime = d;
	}
	public Date getRealFinishTime() {
		return realFinishTime;
	}
	public void setRealFinishTime(Date d) {
		this.realFinishTime = d;
	}
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
		sb.append("Start:\t").append(this.getRealStartTime().getTime()).append("\n");
		sb.append("Finish:\t").append(this.getRealFinishTime().getTime()).append("\n");

		sb.append("\n");
		
		return sb.toString();
	}
}

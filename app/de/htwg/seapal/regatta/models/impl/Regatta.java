package de.htwg.seapal.regatta.models.impl;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import de.htwg.seapal.regatta.models.AbstractRegatta;

@Entity
public class Regatta extends AbstractRegatta {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private String id;

	@Column
	private String name = null;
	
	@Column
	private String host = null;
	
	@Column
	private Date estimatedStartTime = null;
	
	@Column
	private Date estimatedFinishTime = null;
	
	@Column
	private Date realStartTime = null;
	
	@Column
	private Date realFinishTime = null;
	
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
}

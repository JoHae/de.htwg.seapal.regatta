package de.htwg.seapal.regatta.models.impl;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.codehaus.jackson.annotate.JsonProperty;

import de.htwg.seapal.regatta.models.AbstractRegatta;
import de.htwg.seapal.regatta.models.IRegatta;

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
	
	public Regatta() {}
	
	public Regatta(IRegatta regatta) {
		this.id = regatta.getId();
		this.name = regatta.getName();
		this.host = regatta.getHost();
		this.estimatedStartTime = regatta.getEstimatedStartTime();
		this.estimatedFinishTime = regatta.getEstimatedFinishTime();
		this.realStartTime = regatta.getRealStartTime();
		this.realFinishTime = regatta.getRealFinishTime();
	}

	@JsonProperty("_id")
	public String getId() {
		return id;
	}

	@JsonProperty("_id")
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
	
	@JsonProperty("estimated_starttime")
	public Date getEstimatedStartTime() {
		return estimatedStartTime;
	}
	
	@JsonProperty("estimated_starttime")
	public void setEstimatedStartTime(Date d) {
		this.estimatedStartTime = d;
	}
	
	@JsonProperty("estimated_finishtime")
	public Date getEstimatedFinishTime() {
		return estimatedFinishTime;
	}
	
	@JsonProperty("estimated_finishtime")
	public void setEstimatedFinishTime(Date d) {
		this.estimatedFinishTime = d;
	}
	
	@JsonProperty("real_starttime")
	public Date getRealStartTime() {
		return realStartTime;
	}
	
	@JsonProperty("real_starttime")
	public void setRealStartTime(Date d) {
		this.realStartTime = d;
	}
	
	@JsonProperty("real_finishtime")
	public Date getRealFinishTime() {
		return realFinishTime;
	}
	
	@JsonProperty("real_finishtime")
	public void setRealFinishTime(Date d) {
		this.realFinishTime = d;
	}
}

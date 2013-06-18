package de.htwg.seapal.regatta.models.impl;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonProperty;

import de.htwg.seapal.regatta.models.AbstractRegatta;
import de.htwg.seapal.regatta.models.IRegatta;

@Entity
public class Regatta extends AbstractRegatta  {	

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@JsonProperty("_id")
	private String id;

	@JsonProperty("_rev")
	private String revision;
	
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
	
	@Column
	private List<String> boatIds = null;
	
	
	
	public Regatta() {}
	
	public Regatta(IRegatta regatta) {
		this.id = regatta.getId();
		this.name = regatta.getName();
		this.host = regatta.getHost();
		this.estimatedStartTime = regatta.getEstimatedStartTime();
		this.estimatedFinishTime = regatta.getEstimatedFinishTime();
		this.realStartTime = regatta.getRealStartTime();
		this.realFinishTime = regatta.getRealFinishTime();
		this.boatIds = regatta.getBoatIds();
	}

	@JsonProperty("_id")
	@Override
	public String getId() {
		return id;
	}

	@JsonProperty("_id")
	@Override
	public void setId(String id) {
		this.id = id;
	}
	
	@JsonProperty("_rev")
	@Override
	public String getRevision() {
		return revision;
	}
	@JsonProperty("_rev")
	@Override
	public void setRevision(String rev) {
		this.revision = rev;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String getHost() {
		return host;
	}
	@Override
	public void setHost(String host) {
		this.host = host;
	}

	@JsonProperty("estimated_starttime")
	@Override
	public Date getEstimatedStartTime() {
		return estimatedStartTime;
	}

	@JsonProperty("estimated_starttime")
	@Override
	public void setEstimatedStartTime(Date d) {
		this.estimatedStartTime = d;
	}

	@JsonProperty("estimated_finishtime")
	@Override
	public Date getEstimatedFinishTime() {
		return estimatedFinishTime;
	}

	@JsonProperty("estimated_finishtime")
	@Override
	public void setEstimatedFinishTime(Date d) {
		this.estimatedFinishTime = d;
	}

	@JsonProperty("real_starttime")
	@Override
	public Date getRealStartTime() {
		return realStartTime;
	}
	
	@JsonProperty("real_starttime")
	@Override
	public void setRealStartTime(Date d) {
		this.realStartTime = d;
	}

	@JsonProperty("real_finishtime")
	@Override
	public Date getRealFinishTime() {
		return realFinishTime;
	}
	
	@JsonProperty("real_finishtime")
	@Override
	public void setRealFinishTime(Date d) {
		this.realFinishTime = d;
	}

	@Override
	public List<String> getBoatIds() {
		return this.boatIds;
	}

	@Override
	public void addBoat(String boatId) {
		boatIds.add(boatId);
	}
	
	
}

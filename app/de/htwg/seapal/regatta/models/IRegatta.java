package de.htwg.seapal.regatta.models;

import java.util.Date;
import java.util.List;

public interface IRegatta {
	String getId();
	void setId(String id);
	
	String getName();
	void setName(String name);
	
	String getHost();
	void setHost(String host);
	
	Date getEstimatedStartTime();
	void setEstimatedStartTime(Date date);
	
	Date getEstimatedFinishTime();
	void setEstimatedFinishTime(Date date);
	
	Date getRealStartTime();
	void setRealStartTime(Date date);
	
	Date getRealFinishTime();
	void setRealFinishTime(Date date);
	
	List<String> getBoatIds();
	void addBoat(String boatId);
	
	String getString();
	
	String getRevision();
	void setRevision(String revision);
}

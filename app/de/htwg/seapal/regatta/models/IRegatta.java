package de.htwg.seapal.regatta.models;

import java.util.Date;

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
	
	String getString();
}

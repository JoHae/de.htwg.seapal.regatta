package de.htwg.seapal.regatta.models;

import javax.persistence.MappedSuperclass;

import org.codehaus.jackson.annotate.JsonIgnore;

@MappedSuperclass
public abstract class AbstractRegatta implements IRegatta {

	@JsonIgnore
	@Override
	public String getString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n");
		sb.append("ID:\t\t\t").append(this.getId()).append("\n");
		sb.append("Name:\t\t\t").append(this.getName()).append("\n");
		sb.append("Host:\t\t\t").append(this.getHost()).append("\n");
		sb.append("Estimated Start Time:\t").append(this.getEstimatedStartTime()).append("\n");
		sb.append("Estimated Finish Time:\t").append(this.getEstimatedFinishTime()).append("\n");
		sb.append("Real Start Time:\t").append(this.getRealStartTime()).append("\n");
		sb.append("Real Finish Time:\t").append(this.getRealFinishTime()).append("\n");
		sb.append("\n");
		
		return sb.toString();
	}
}

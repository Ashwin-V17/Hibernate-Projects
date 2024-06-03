package com;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Train {
	@Id
	private int trainNo;
	private String name;
	private String departure;
	private String arrival;
	private double ticketCost;
	public int getTrainNo() {
		return trainNo;
	}
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}
	@Override
	public String toString() {
		return "Train [trainNo=" + trainNo + ", name=" + name + ", departure=" + departure + ", arrival=" + arrival
				+ ", ticketCost=" + ticketCost + "]";
	}
	
																																																																																																																																															
}		

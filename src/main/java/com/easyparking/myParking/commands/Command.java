package com.easyparking.myParking.commands;

import com.easyparking.myParking.parking.Parking;

public abstract class Command {
	// Name of the command
	protected String name="";


	public String getName() {
		return name;
	}
	
	public abstract String run(String[] str, Parking park);
}

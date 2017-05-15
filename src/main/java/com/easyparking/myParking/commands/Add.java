package com.easyparking.myParking.commands;

import com.easyparking.myParking.parking.Parking;
import com.easyparking.myParking.vehicules.Vehicule;
import com.easyparking.myParking.vehicules.VehiculeFactory;

public class Add extends Command {

	public Add(){
		super.name="add";
	}

	@Override
	public String run(String[] str, Parking park) {
		
		if(str.length != 1)
		{
			return "Wrong number of arguments, see help";
		}
		
		String nameVehicule = str[0];
		VehiculeFactory vehiculeFactory = new VehiculeFactory();
		Vehicule v = vehiculeFactory.createVehicule(nameVehicule);
			
		if (v == null) {
			return "Bad type, " + nameVehicule + " does not exist.";
		} else {
			if (park.getPlacesTaken()+v.getSize() <= park.getMaxPlaces()){
				park.addVehicule(v);
				return "A " + v.getType() + " of size " + v.getSize() + " was added - parking ["+park.getPlacesTaken()+"/"+park.getMaxPlaces()+"]";
			}
		}
		return "There is not enough place for this vehicule.";
	}
}

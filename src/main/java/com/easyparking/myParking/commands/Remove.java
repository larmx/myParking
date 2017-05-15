package com.easyparking.myParking.commands;

import com.easyparking.myParking.parking.Parking;
import com.easyparking.myParking.vehicules.Vehicule;
import com.easyparking.myParking.vehicules.VehiculeFactory;

public class Remove extends Command{
	
	public Remove(){
		super.name = "remove";
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
			if (park.getPlacesTaken()-v.getSize() > 0){
				park.removeVehicule(v);
				return "A " + v.getType() + " of size " + v.getSize() + " was removed - parking ["+park.getPlacesTaken()+"/"+park.getMaxPlaces()+"]";
			}
		}
		return "This vehicule is not in the parking anymore, or the parking may even be empty!";
	}

	
}

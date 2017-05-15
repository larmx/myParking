package com.easyparking.myParking.vehicules;

public class VehiculeFactory {

	public Vehicule createVehicule(String vehiculeType) {
		if(vehiculeType == null){
			return null;
		}
		if(vehiculeType.equalsIgnoreCase("CAR")){
			return new Car();
		} else if (vehiculeType.equalsIgnoreCase("BUS")){
			return new Bus();
		} else if (vehiculeType.equalsIgnoreCase("VAN")){
			return new Van();
		} 
		
		return null;
	}
	
}

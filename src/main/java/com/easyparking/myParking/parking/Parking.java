package com.easyparking.myParking.parking;



import java.util.HashSet;

import com.easyparking.myParking.vehicules.Vehicule;

public class Parking {
	
	private int maxPlaces;
	private int placesTaken = 0;
	private HashSet<Vehicule> parkedVehicules;
	
	public Parking(int maxPlaces){
		this.maxPlaces = maxPlaces;
		setParkedVehicules(new HashSet<Vehicule>());
	}
	
	public void addVehicule(Vehicule v){
		this.placesTaken+=v.getSize();
		parkedVehicules.add(v);
	}
	
	public void removeVehicule(Vehicule v){
		this.placesTaken-=v.getSize();
		for(Vehicule vehicule: parkedVehicules){
			if(vehicule.getSize()==v.getSize()){
				parkedVehicules.remove(vehicule);
				break;
			}
		}
	}

	public int getMaxPlaces() {
		return maxPlaces;
	}

	public void setMaxPlaces(int maxPlaces) {
		this.maxPlaces = maxPlaces;
	}

	public int getPlacesTaken() {
		return placesTaken;
	}

	public void setPlacesTaken(int placesTaken) {
		this.placesTaken = placesTaken;
	}

	public HashSet<Vehicule> getParkedVehicules() {
		return parkedVehicules;
	}

	public void setParkedVehicules(HashSet<Vehicule> parkedVehicules) {
		this.parkedVehicules = parkedVehicules;
	}
	
}

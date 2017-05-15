package com.easyparking.myParking.vehicules;

public abstract class Vehicule {
	private String type;
	private int size;
	
	public Vehicule(int size){
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}

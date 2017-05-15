package com.easyparking.myparking.junits;

import static org.junit.Assert.*;

import org.junit.Test;

import com.easyparking.myParking.parking.Parking;
import com.easyparking.myParking.vehicules.Bus;

public class ParkingTest {

	@Test
	public void testParking() {
		Parking park = new Parking(4);
		assertTrue(park.getMaxPlaces()==4);
	}

	@Test
	public void testAddVehicule() {
		Parking park = new Parking(4);
		Bus bus = new Bus();
		assertTrue(park.getPlacesTaken()==0);
		park.addVehicule(bus);
		assertTrue(park.getPlacesTaken()==3);
	}

	@Test
	public void testRemoveVehicule() {
		Parking park = new Parking(7);
		Bus bus = new Bus();
		park.addVehicule(bus);
		park.removeVehicule(bus);
		assertTrue(park.getPlacesTaken()==0);
	}

}

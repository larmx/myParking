package com.easyparking.myparking.junits;

import static org.junit.Assert.*;

import org.junit.Test;

import com.easyparking.myParking.vehicules.Bus;
import com.easyparking.myParking.vehicules.Car;
import com.easyparking.myParking.vehicules.Van;
import com.easyparking.myParking.vehicules.VehiculeFactory;

public class VehiculeFactoryTest {

	@Test
	public void testCreateVehicule() {
		String str = "car";
		String str2 = "bus";
		String str3 = "van";
		VehiculeFactory vf = new VehiculeFactory();
		assertTrue(vf.createVehicule(str) instanceof Car);
		assertTrue(vf.createVehicule(str2) instanceof Bus);
		assertTrue(vf.createVehicule(str3) instanceof Van);
	}

}

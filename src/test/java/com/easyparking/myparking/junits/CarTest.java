package com.easyparking.myparking.junits;

import static org.junit.Assert.*;

import org.junit.Test;

import com.easyparking.myParking.vehicules.Car;

public class CarTest {

	@Test
	public void testCar() {
		Car car = new Car();
		assertTrue(car.getType().equalsIgnoreCase("car"));
		assertTrue(car.getSize()==1);
	}

}

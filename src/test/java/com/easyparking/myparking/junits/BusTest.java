package com.easyparking.myparking.junits;

import static org.junit.Assert.*;

import org.junit.Test;

import com.easyparking.myParking.vehicules.Bus;


public class BusTest {

	@Test
	public void testBus() {
		Bus bus = new Bus();
		assertTrue(bus.getType().equalsIgnoreCase("bus"));
		assertTrue(bus.getSize()==3);
	}

}

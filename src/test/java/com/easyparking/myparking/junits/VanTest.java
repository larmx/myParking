package com.easyparking.myparking.junits;

import static org.junit.Assert.*;

import org.junit.Test;

import com.easyparking.myParking.vehicules.Van;

public class VanTest {

	@Test
	public void testVan() {
		Van van = new Van();
		assertTrue(van.getType().equalsIgnoreCase("van"));
		assertTrue(van.getSize()==2);
	}
}

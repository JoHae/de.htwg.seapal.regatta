package test.de.htwg.seapal.reagatta.models.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.htwg.seapal.regatta.models.impl.Regatta;

public class RegattaTest {

	private Regatta regatta;

	@Before
	public void setup() {
		regatta = new Regatta();
	}

	@Test
	public void testGetId() {
		regatta.setId("0");
		assertEquals("0", regatta.getId());
	}
	
	@Test
	public void testGetName() {
		regatta.setName("Testregatta-");
		assertEquals("Testregatta-", regatta.getName());
	}

	@Test
	public void testGetHost() {
		regatta.setHost("EinHost");
		assertEquals("EinHost", regatta.getHost());
	}
}

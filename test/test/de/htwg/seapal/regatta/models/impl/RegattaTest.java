package test.de.htwg.seapal.regatta.models.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import de.htwg.seapal.regatta.models.IRegatta;
import de.htwg.seapal.regatta.models.impl.Regatta;

public class RegattaTest {

	private IRegatta regatta;

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
	
	@Ignore("Dev - Status")
	@Test
	public void testGetString() {
		IRegatta regatta = new Regatta();
		regatta.setHost("host");
		regatta.setId("1");
		regatta.setName("So isses");
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n");
		sb.append("ID:\t").append("1").append("\n");
		sb.append("Name:\t").append("So isses").append("\n");
		sb.append("Host:\t").append("host").append("\n");

		sb.append("\n");
		
		assertEquals(sb.toString(), regatta.getString());
	}
}

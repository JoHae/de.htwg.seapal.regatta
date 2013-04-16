package test.de.htwg.seapal.regatta.models.impl;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import de.htwg.seapal.regatta.models.impl.Regatta;

public class RegattaTest {

	private Regatta regatta;

	@Before
	public void setup(){
		regatta = new Regatta();	
	}

	@Test
	public void testName() {
		String teststring = "Testregatta";
		regatta.setName(teststring);
		assertEquals(teststring, regatta.getName());
	}
	
	@Test
	public void testHost() {
		String teststring = "Hulk Hogan";
		regatta.setHost(teststring);
		assertEquals(teststring, regatta.getHost());
	}
}

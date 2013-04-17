package test.de.htwg.seapal.regatta.models.mock;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.htwg.seapal.regatta.models.mock.Regatta;

public class RegattaTest {
	
	private Regatta regatta;

	@Before
	public void setup(){
		regatta = new Regatta();
	}

	@Test
	public void testGetName() {
		assertEquals("In 80 Tagen um den See", regatta.getName());
	}
	
	@Test
	public void testGetId() {
		assertEquals("REGATTA-1", regatta.getId());
	}
	
	@Test
	public void testGetHost() {
		assertEquals("Yachtclub Hulk Hogan", regatta.getHost());
	}
	
	@Test
	public void testSetter() {
		regatta.setName("asdf");
		regatta.setHost("host");
		regatta.setId("test");
		assertNotSame("asdf", regatta.getName());
		assertNotSame("host", regatta.getHost());
		assertNotSame("test", regatta.getId());
	}

}

package test.de.htwg.seapal.regatta.controllers.impl;
import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;


import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.regatta.app.RegattaDemoImplModule;
import de.htwg.seapal.regatta.controllers.IRegattaController;

public class RegattaControllerTest {

	private IRegattaController regattaController;
	// Set up Google Guice Dependency Injector
	Injector injector = Guice.createInjector(new RegattaDemoImplModule());

	@Before
	public void setup() {
		// Build up the application, resolving dependencies automatically by Guice
		regattaController = injector.getInstance(IRegattaController.class);
	}

	@Test
	public void testGetRegattaName() {
		String id = "0";
		regattaController.addRegatta(id);
		regattaController.setRegattaName(id, "xd");
		regattaController.setRegattaName("EINE_NICHT_EXISTIERENDE_ID", "xd");
		assertEquals("xd", regattaController.getRegattaName(id));
		assertEquals(null, regattaController.getRegattaName("EINE_NICHT_EXISTIERENDE_ID"));
	}

	@Test
	public void testGetRegattaList() {
		assertEquals(null, regattaController.getRegattaList());
	}
	
	@Test
	public void testGetRegattaHost() {
		String id = "0";
		regattaController.addRegatta(id);
		regattaController.setRegattaHost(id, "EIN_HOST");
		regattaController.setRegattaHost("EINE_NICHT_EXISTIERENDE_ID", "EIN_HOST");
		assertEquals("EIN_HOST", regattaController.getRegattaHost(id));
		assertEquals(null, regattaController.getRegattaHost("EINE_NICHT_EXISTIERENDE_ID"));
	}
	
	@Test
	public void testGetRegattaString() {
		String id = "0";
		regattaController.addRegatta(id);
		regattaController.setRegattaHost(id, "EIN_HOST");
		regattaController.setRegattaName(id, "EIN_NAME");
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("\n");
		sb.append("ID:\t").append("0").append("\n");
		sb.append("Name:\t").append("EIN_NAME").append("\n");
		sb.append("Host:\t").append("EIN_HOST").append("\n");

		sb.append("\n");

		assertEquals(sb.toString(), regattaController.getRegattaString("0"));
		assertEquals(null, regattaController.getRegattaString("EINE_NICHT_EXISTIERENDE_ID"));
	}
}

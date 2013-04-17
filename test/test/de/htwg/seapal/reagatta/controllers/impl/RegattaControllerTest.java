package test.de.htwg.seapal.reagatta.controllers.impl;
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
	public void testGetBoatName() {
		String id = "0";
		regattaController.addRegatta(id);
		regattaController.setRegattaName(id, "xd");
		assertEquals("xd", regattaController.getRegattaName(id));
	}

}

package test.de.htwg.seapal.reagatta.controllers.mock;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.regatta.app.RegattaDemoMockModule;
import de.htwg.seapal.regatta.controllers.IRegattaController;

public class RegattaControllerTest {

	private IRegattaController regattaController;
	// Set up Google Guice Dependency Injector
	Injector injector = Guice.createInjector(new RegattaDemoMockModule());
	
	private static final String ID = "0";
	
	@Before
	public void setup(){
		// Build up the application, resolving dependencies automatically by Guice
		regattaController = injector.getInstance(IRegattaController.class);
		
		regattaController.addRegatta(ID);
		regattaController.setRegattaName(ID, "Testregatta-OHNE-ALLES-HAHA");
		regattaController.setRegattaHost(ID, "HOSTNAME-OHNE-ALLES-HAHA-GARGAMEL");
	}

	@Test
	public void testGetRegattaName() {
		
		assertEquals("Testregatta", regattaController.getRegattaName(ID));
	}
	
	@Test
	public void testGetRegattaHost() {	
		assertEquals("Yachtclub", regattaController.getRegattaHost(ID));
	}

}

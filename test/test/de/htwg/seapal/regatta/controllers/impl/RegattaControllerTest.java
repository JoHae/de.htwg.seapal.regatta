package test.de.htwg.seapal.regatta.controllers.impl;
import static org.junit.Assert.*;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import play.api.Application;
import play.api.DefaultApplication;
import play.api.Mode;
import play.api.Play;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.regatta.app.RegattaDemoImplModule;
import de.htwg.seapal.regatta.controllers.IRegattaController;

public class RegattaControllerTest {

	private static IRegattaController regattaController;
	// Set up Google Guice Dependency Injector
	private static Injector injector = Guice.createInjector(new RegattaDemoImplModule());

	@BeforeClass
	public static void setup() {
		// Build up the application, resolving dependencies automatically by Guice
		regattaController = injector.getInstance(IRegattaController.class);
		
		Application play = new DefaultApplication(new File("."),
				RegattaControllerTest.class.getClassLoader(), null, Mode.Dev());
		Play.start(play);
	}
	
	@AfterClass
	public static void shutdown() {
		Play.stop();
	}

	@Test
	public void testGetRegattaName() {
		String id = "0";
		regattaController.deleteRegattaById(id);
		regattaController.addRegatta(id);
		regattaController.setRegattaName(id, "xd");
		regattaController.setRegattaName("EINE_NICHT_EXISTIERENDE_ID", "xd");
		assertEquals("xd", regattaController.getRegattaName(id));
		assertEquals(null, regattaController.getRegattaName("EINE_NICHT_EXISTIERENDE_ID"));
	}

	@Test
	public void testGetRegattaList() {
		List<String> ids = new LinkedList<String>();

		for (int i = 0; i < 10; i++) {
			regattaController.deleteRegattaById(String.valueOf(i));
			regattaController.addRegatta(String.valueOf(i));
			ids.add(String.valueOf(i));
		}
		
		List<String> regattas = regattaController.getRegattaIds();
		
		Iterator<String> it = ids.iterator();
		while (it.hasNext()) {
			String id = (String) it.next();
			assertTrue(regattas.contains(id));
			regattas.remove(id);
		}
		assertTrue(regattas.isEmpty());
	}
	
	@Test
	public void testGetRegattaHost() {
		String id = "0";
		regattaController.deleteRegattaById(id);
		regattaController.addRegatta(id);
		regattaController.setRegattaHost(id, "EIN_HOST");
		regattaController.setRegattaHost("EINE_NICHT_EXISTIERENDE_ID", "EIN_HOST");
		assertEquals("EIN_HOST", regattaController.getRegattaHost(id));
		assertEquals(null, regattaController.getRegattaHost("EINE_NICHT_EXISTIERENDE_ID"));
	}
	
	@Ignore("Dev - Status")
	@Test
	public void testGetRegattaString() {
		String id = "0";
		regattaController.deleteRegattaById(id);
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

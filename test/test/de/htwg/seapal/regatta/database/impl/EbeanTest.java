package test.de.htwg.seapal.regatta.database.impl;

import static org.junit.Assert.*;

import java.io.File;
import java.util.List;

import org.junit.*;

import play.api.Application;
import play.api.DefaultApplication;
import play.api.Mode;
import play.api.Play;
import test.de.htwg.seapal.regatta.controllers.impl.RegattaControllerTest;

import de.htwg.seapal.regatta.database.impl.RegattaEbeanDatabase;
import de.htwg.seapal.regatta.models.IRegatta;
import de.htwg.seapal.regatta.models.impl.Regatta;

public class EbeanTest {

	private static IRegatta regatta1;
	private static IRegatta regatta2;
	private static RegattaEbeanDatabase db;
	private static String ID_1 = "1";
	private static String ID_2 = "2";
	
	@BeforeClass
	public static void start() {
		Application play = new DefaultApplication(new File("."),
				RegattaControllerTest.class.getClassLoader(), null, Mode.Dev());
		Play.start(play);
		
		db = new RegattaEbeanDatabase();
		
		regatta1 = new Regatta();
		regatta1.setId(ID_1);
		
		regatta2 = new Regatta();
		regatta2.setId(ID_2);
	
		String name_1 = "Testregatta1";
		String host_1 = "Testhost1";
		
		String name_2 = "Testregatta2";
		String host_2 = "Testhost2";
		
		regatta1.setHost(host_1);
		regatta1.setName(name_1);
		
		regatta2.setHost(host_2);
		regatta2.setName(name_2);
	}
	
	@AfterClass
	public static void afterClass() {
		Play.stop();
	}
	
	@After
	public void shutdown() {
		db.deleteRegattaById(ID_1);
		db.deleteRegattaById(ID_2);
	}

	@Test
	public void testContains() {
		db.saveRegatta(regatta1);
		assertTrue(db.containsRegatta(ID_1));
		assertFalse(db.containsRegatta(ID_2));
	}
	
	@Test
	public void testDelete() {
		db.saveRegatta(regatta1);
		assertTrue(db.containsRegatta(ID_1));
		db.deleteRegattaById(ID_1);
	}
	
	@Test
	public void testValueChanged() {
		String oldName = regatta1.getName();
		String newName = "Test1234";
		db.saveRegatta(regatta1);
		assertTrue(db.getRegattaById(ID_1).getName() == oldName);
		regatta1.setName(newName);
		db.saveRegatta(regatta1);
		assertTrue(db.getRegattaById(ID_1).getName() == newName);
	}
	
	@Test
	public void testRegattaIds() {
		db.saveRegatta(regatta1);
		db.saveRegatta(regatta2);
		List<String> regattaIds = db.getAllRegattaIds();
		assertTrue(regattaIds.size() == 2);
		assertTrue(regattaIds.contains(ID_1));
		assertTrue(regattaIds.contains(ID_2));
	}
}
package test.de.htwg.seapal.regatta.database.impl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.htwg.seapal.regatta.database.impl.RegattaHashMapDatabase;
import de.htwg.seapal.regatta.models.impl.Regatta;

public class HashMapTest {

	private static Regatta regatta1;
	private static Regatta regatta2;
	private RegattaHashMapDatabase db;
	private static String ID_1 = "1";
	private static String ID_2 = "2";
	
	@BeforeClass
	public static void start() {
		regatta1 = new Regatta();
		regatta2 = new Regatta();
		
		String name_1 = "Testregatta1";
		String host_1 = "Testhost1";
		
		String name_2 = "Testregatta2";
		String host_2 = "Testhost2";
		
		regatta1.setId(ID_1);
		regatta1.setHost(host_1);
		regatta1.setName(name_1);
		
		regatta2.setId(ID_2);
		regatta2.setHost(host_2);
		regatta2.setName(name_2);
	}
	
	@After
	public void shutdown() {
	}

	@Before
	public void setup(){
		db = new RegattaHashMapDatabase();
	}

	@Test
	public void testContains() {
		db.saveRegatta(regatta1);
		assertTrue(db.containsRegatta(ID_1));
	}
	
	@Test
	public void testDelete() {
		db.saveRegatta(regatta1);
		assertTrue(db.containsRegatta(ID_1));
		db.deleteRegattaById(ID_1);
		assertFalse(db.containsRegatta(ID_1));
	}
	
	@Test
	public void testValueChanged() {
		String oldName = regatta1.getName();
		String newName = "Test1234";
		db.saveRegatta(regatta1);
		assertTrue(db.getRegattaById(ID_1).getName() == oldName);
		regatta1.setName(newName);
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

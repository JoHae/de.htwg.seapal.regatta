package test.de.htwg.seapal.regatta.database.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import de.htwg.seapal.regatta.database.impl.RegattaCouchDatabase;
import de.htwg.seapal.regatta.models.impl.Regatta;

public class RegattaCouchDatabaseTest {

	private RegattaCouchDatabase db;
	private Regatta regatta1;
	private Regatta regatta2;
	private static String ID_1 = "1";
	private static String ID_2 = "2";

	@Before
	public void setUp() throws Exception {
		db = new RegattaCouchDatabase();
		
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
		
		db.saveRegatta(regatta1);
		db.saveRegatta(regatta2);
	}

	@After
	public void tearDown() throws Exception {
		db.deleteRegattaById(ID_1);
		db.deleteRegattaById(ID_2);
	}

	@Test
	public void testContains() {
		db.saveRegatta(regatta1);
		assertTrue(db.containsRegatta(ID_1));
		assertFalse(db.containsRegatta(ID_2));
		db.deleteRegattaById(regatta1.getId());
	}
	
	@Test
	public void testDelete() {
		db.saveRegatta(regatta1);
		assertTrue(db.containsRegatta(ID_1));
		db.deleteRegattaById(regatta1.getId());
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
		db.deleteRegattaById(regatta1.getId());
	}
	
	@Test
	public void testRegattaIds() {
		db.saveRegatta(regatta1);
		db.saveRegatta(regatta2);
		List<String> regattaIds = db.getAllRegattaIds();
		assertTrue(regattaIds.size() == 2);
		assertTrue(regattaIds.contains(ID_1));
		assertTrue(regattaIds.contains(ID_2));
		db.deleteRegattaById(regatta1.getId());
		db.deleteRegattaById(regatta2.getId());
	}
}

package test.de.htwg.seapal.regatta.database.impl;

import static org.junit.Assert.*;

import org.junit.*;

import de.htwg.seapal.regatta.database.impl.Db4oDatabase;
import de.htwg.seapal.regatta.models.impl.Regatta;

public class Db4oTest {

	private static Regatta regatta1;
	private static Regatta regatta2;
	private Db4oDatabase db;
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
		db.closeDb();
	}

	@Before
	public void setup(){
		db = new Db4oDatabase();
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
}

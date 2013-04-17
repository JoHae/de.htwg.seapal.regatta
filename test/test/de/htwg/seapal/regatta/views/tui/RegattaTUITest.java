package test.de.htwg.seapal.regatta.views.tui;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import de.htwg.seapal.regatta.controllers.IRegattaController;
import de.htwg.seapal.regatta.controllers.impl.RegattaController;
import de.htwg.seapal.regatta.views.tui.RegattaTUI;

public class RegattaTUITest {
	
	private RegattaTUI regatta;

	@Before
	public void setup(){
		IRegattaController controller = new RegattaController();
		regatta = new RegattaTUI(controller);
	}

	@Test
	public void testGetMenu() {
		assertEquals("Regatta", regatta.getMenuEntry());
		assertEquals('r', regatta.getMenuKey());
	}
}

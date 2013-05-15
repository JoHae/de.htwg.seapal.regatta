package test.de.htwg.seapal.regatta.views.tui;

import static org.junit.Assert.*;

import java.rmi.RemoteException;

import org.junit.Before;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.regatta.app.RegattaDemoImplModule;
import de.htwg.seapal.regatta.controllers.IRegattaController;
import de.htwg.seapal.regatta.views.tui.RegattaTUI;

public class RegattaTUITest {
	
	private RegattaTUI regatta;

	@Before
	public void setup() throws RemoteException {
		Injector injector = Guice.createInjector(new RegattaDemoImplModule());
		IRegattaController controller = injector.getInstance(IRegattaController.class);
		regatta = new RegattaTUI(controller);
	}

	@Test
	public void testGetMenu() {
		assertEquals("Regatta", regatta.getMenuEntry());
		assertEquals('r', regatta.getMenuKey());
	}
}

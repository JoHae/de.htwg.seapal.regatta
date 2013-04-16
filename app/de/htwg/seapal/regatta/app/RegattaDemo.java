package de.htwg.seapal.regatta.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.htwg.seapal.regatta.controllers.IRegattaController;
import de.htwg.seapal.regatta.views.tui.RegattaTUI;

public class RegattaDemo {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		// Set up Google Guice Dependency Injector
		Injector injector = Guice.createInjector(new RegattaDemoImplModule());

		// Build up the application, resolving dependencies automatically by
		// Guice
		IRegattaController controller = injector
				.getInstance(IRegattaController.class);

		RegattaTUI tui = new RegattaTUI(controller);

		tui.printTUI();

		// continue to read user input on the tui until the user decides to quit
		boolean continu = true;

		InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		while (continu) {
			continu = tui.processInputLine(br.readLine());
		}

	}

}

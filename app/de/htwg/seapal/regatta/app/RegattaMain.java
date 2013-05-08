package de.htwg.seapal.regatta.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import com.google.inject.Guice;
import com.google.inject.Injector;

import play.api.Application;
import play.api.DefaultApplication;
import play.api.Mode;
import play.api.Play;

import de.htwg.seapal.regatta.controllers.IRegattaController;
import de.htwg.seapal.regatta.views.tui.RegattaTUI;

public final class RegattaMain {

	private RegattaMain() {}

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		Application play = new DefaultApplication(new File("."),
				RegattaMain.class.getClassLoader(), null, Mode.Dev());
		Play.start(play);

		// Set up Google Guice Dependency Injector
		Injector injector = Guice.createInjector(new RegattaDemoImplModule());

		// Build up the application, resolving dependencies automatically by
		// Guice
		IRegattaController controller = injector
				.getInstance(IRegattaController.class);

		RegattaTUI tui = new RegattaTUI(controller);

		// continue to read user input on the tui until the user decides to quit
		InputStreamReader isr = new InputStreamReader(System.in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);

		do {
			tui.printTUI();
		} while(tui.processInputLine(br.readLine()));

		Play.stop();
	}

}
package views.tui;

import java.util.Scanner;

import controllers.IRegattaController;
import util.observer.Event;
import util.observer.IObserver;


public class RegattaTUI implements IObserver{
	
	private IRegattaController controller;

	public RegattaTUI(IRegattaController controller) {
		this.controller = controller;
		controller.addObserver(this);
	}

	public void update(Event e) {
		printTUI();
	}

	public boolean processInputLine(String line) {
		boolean continu = true;
		if (line.equalsIgnoreCase("q")) {
			continu = false;
		}
		if (line.equalsIgnoreCase("n")) {
			Scanner scanner = new Scanner(System.in);
			controller.setRegattaName(scanner.nextLine());
			scanner.close();
		}
		if (line.equalsIgnoreCase("h")) {
			Scanner scanner = new Scanner(System.in);
			controller.setRegattaHost(scanner.nextLine());	
			scanner.close();
		}
		
		return continu;
	}
	
	public void printTUI() {
		System.out.println("BoatDemo: n - new Name");
		System.out.println("BoatDemo: h - new Host");
		System.out.println(controller.getString());
	}

}

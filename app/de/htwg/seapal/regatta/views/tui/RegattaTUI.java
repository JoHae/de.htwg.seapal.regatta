package de.htwg.seapal.regatta.views.tui;

import java.util.Scanner;

import de.htwg.seapal.regatta.controllers.IRegattaController;
import de.htwg.seapal.regatta.util.observer.Event;
import de.htwg.seapal.regatta.util.observer.IObserver;
import de.htwg.util.plugin.Plugin;

public class RegattaTUI implements IObserver, Plugin {

	private IRegattaController controller;

	public RegattaTUI(IRegattaController controller) {
		this.controller = controller;
		controller.addObserver(this);
	}

	public void update(Event e) {
		printTUI();
	}

	@Override
	public boolean processInputLine(String line) {

		boolean continu = true;
		Scanner scanner = new Scanner(line);

		scanner.useDelimiter(" ");
		String command = null;
		String[] commandLine;

		try {
			scanner.next();
			commandLine = line.split(" ");
			command = commandLine[0];

			switch (command) {

			case "q":
				continu = false;
				break;

			case "a":
				controller.addRegatta(scanner.next());
				break;

			case "n":
				controller.setRegattaName(scanner.next(), scanner.next());
				break;

			case "h":
				controller.setRegattaHost(scanner.next(), scanner.next());
				break;

			case "p":
				System.out.println(controller.getRegattaString(scanner.next()));
				printTUI();
				break;

			default:
				System.out.println("Unknown Command! Pleas try again ...");
			}
		} catch (Exception ex) {
			ex.getMessage();
		} finally {
			scanner.close();
			scanner = null;
		}

		return continu;
	}

	@Override
	public void printTUI() {

		StringBuilder sb = new StringBuilder();

		sb.append("RegattaDemo: ").append("\n");
		sb.append("a <ID>        - add Regatta with specified ID").append("\n");
		sb.append("n <ID> <NAME> - set Name of Regatta with ID = <ID>").append("\n");
		sb.append("h <ID> <HOST> - set Host of Regatta with ID = <ID>").append("\n");
		sb.append("p <ID>        - print Data of Regatta with ID = <ID>").append("\n");
		sb.append("\n");
		sb.append(">>");

		System.out.print(sb.toString());
	}

	@Override
	public String getMenuEntry() {
		return "Regatta";
	}

	@Override
	public char getMenuKey() {
		return 'r';
	}

}

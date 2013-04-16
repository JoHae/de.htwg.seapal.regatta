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
		char command;
		String[] commandLine;

		try {
			scanner.next();
			commandLine = line.split(" ");
			
			if (commandLine[0].length() != 1) {
				System.out.println("Unknown Command! Please try again ...");
				printTUI();
				scanner.close();
				return continu;
			}
			
			command = commandLine[0].charAt(0);
			
			switch (command) {

			case 'q':
				continu = false;
				System.out.println("Quitting ...");
				break;

			case 'a':
				if (!scanner.hasNext()) {
					System.out.println("Missing regatta ID ...");
					printTUI();
					break;
				} else {
					controller.addRegatta(scanner.next());
				}
				break;

			case 'n':
				String regattaId;
				String value;
				
				if(!scanner.hasNext()) {
					System.out.println("Missing regatta ID ...");
					printTUI();
					break;
				} else {
					regattaId = scanner.next();
				}
				
				if(!scanner.hasNext()) {
					System.out.println("Missing name value ...");
					printTUI();
					break;
				} else {
					value = scanner.next();
				}
				controller.setRegattaName(regattaId, value);
				break;

			case 'h':
				if(!scanner.hasNext()) {
					System.out.println("Missing regatta ID ...");
					printTUI();
					break;
				} else {
					regattaId = scanner.next();
				}
				
				if(!scanner.hasNext()) {
					System.out.println("Missing name value ...");
					printTUI();
					break;
				} else {
					value = scanner.next();
				}
				controller.setRegattaHost(regattaId, value);
				break;

			case 'p':
				if (!scanner.hasNext()) {
					System.out.println("Missing regatta ID ...");
					printTUI();
					break;
				} else {
					System.out.println(controller.getRegattaString(scanner.next()));
				}
				break;

			default:
				System.out.println("Unknown Command! Please try again ...");
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
		sb.append("\n");
		sb.append("RegattaDemo: ").append("\n");
		sb.append("a <ID>        - add Regatta with specified ID").append("\n");
		sb.append("n <ID> <NAME> - set Name of Regatta with ID = <ID>").append("\n");
		sb.append("h <ID> <HOST> - set Host of Regatta with ID = <ID>").append("\n");
		sb.append("p <ID>        - print Data of Regatta with ID = <ID>").append("\n");
		sb.append("p             - End this Demo").append("\n");
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

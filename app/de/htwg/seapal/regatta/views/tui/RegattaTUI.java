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
		String unknownCommand = "Unknown Command! Please try again ...";		
		
		boolean continu = true;
		Scanner scanner = new Scanner(line);

		scanner.useDelimiter(" ");
		char command;
		String[] commandLine;

		try {
			scanner.next();
			commandLine = line.split(" ");
			
			if (commandLine[0].length() != 1) {
				System.out.println(unknownCommand);
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
				addRegattaCommand(scanner);
				break;

			case 'n':
				changeNameCommand(scanner);
				break;

			case 'h':
				changeHostCommand(scanner);
				break;

			case 'p':
				printCommand(scanner);
				break;

			default:
				System.out.println(unknownCommand);
			}
		} catch (Exception ex) {
			ex.getMessage();
		} finally {
			scanner.close();
			scanner = null;
		}
		return continu;
	}
	
	private void printCommand(Scanner scanner) {
		if (!scanner.hasNext()) {
			System.out.println("Missing ID! Please try again ...");
			printTUI();
		} else {
			System.out.println(controller.getRegattaString(scanner.next()));
		}
	}

	private void addRegattaCommand(Scanner scanner) {
		if (!scanner.hasNext()) {
			System.out.println("Missing ID! Please try again ...");
			printTUI();
		} else {
			controller.addRegatta(scanner.next());
		}
	}
	
	private void changeNameCommand(Scanner scanner) {
		String regattaId;
		String value;
		
		if(!scanner.hasNext()) {
			System.out.println("Missing ID! Please try again ...");
			printTUI();
			return;
		} else {
			regattaId = scanner.next();
		}
		
		if(!scanner.hasNext()) {
			System.out.println("Missing name value! Please try again ...");
			printTUI();
			return;
		} else {
			value = scanner.next();
		}
		controller.setRegattaName(regattaId, value);
	}
	
	private void changeHostCommand(Scanner scanner) {
		String regattaId;
		String value;
		
		if(!scanner.hasNext()) {
			System.out.println("Missing ID! Please try again ...");
			printTUI();
			return;
		} else {
			regattaId = scanner.next();
		}
		
		if(!scanner.hasNext()) {
			System.out.println("Missing hostname value! Please try again ...");
			printTUI();
			return;
		} else {
			value = scanner.next();
		}
		controller.setRegattaHost(regattaId, value);
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

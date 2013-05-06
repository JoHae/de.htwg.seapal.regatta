package de.htwg.seapal.regatta.views.tui;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import de.htwg.seapal.regatta.controllers.IRegattaController;
import de.htwg.seapal.regatta.util.observer.Event;
import de.htwg.seapal.regatta.util.observer.IObserver;
import de.htwg.util.plugin.Plugin;

public class RegattaTUI implements IObserver, Plugin {

	private IRegattaController controller;
	private static final String MISSINGID = "Missing ID! Please try again ...";
	private static final String MISSINGVALUE = "Missing value! Please try again ...";
	private static final String UNKNOWNCOMMAND = "Unknown Command! Please try again ...";
	private static final PrintStream OUT = System.out;

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
				OUT.println(UNKNOWNCOMMAND); 
				printTUI();
				scanner.close();
				return continu;
			}
			
			command = commandLine[0].charAt(0);
		
			switch (command) {

			case 'q':
				continu = false;
				OUT.println("Quitting ...");
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
				
			case 's':
				changeRegattaEstimatedStartTime(scanner);
				break;
				
			case 'f':
				changeRegattaEstimatedFinishTime(scanner);
				break;

			default:
				OUT.println(UNKNOWNCOMMAND);
				printTUI();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			scanner.close();
			scanner = null;
		}
		return continu;
	}
	
	private void changeRegattaEstimatedFinishTime(Scanner scanner) {
		String regattaId;
		String value;
		
		if(!scanner.hasNext()) {
			OUT.println(MISSINGID);
			printTUI();
			return;
		} else {
			regattaId = scanner.next();
		}
		
		if(!scanner.hasNext()) {
			OUT.println(MISSINGVALUE);
			printTUI();
			return;
		} else {
			value = scanner.next();
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy/hh:mm:ss");
			try {
				controller.setRegattaEstimatedFinishTime(regattaId, formatter.parse(value));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void changeRegattaEstimatedStartTime(Scanner scanner) {
		String regattaId;
		String value;
		
		if(!scanner.hasNext()) {
			OUT.println(MISSINGID);
			printTUI();
			return;
		} else {
			regattaId = scanner.next();
		}
		
		if(!scanner.hasNext()) {
			OUT.println(MISSINGVALUE);
			printTUI();
			return;
		} else {
			value = scanner.next();
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy/hh:mm:ss");
			try {
				controller.setRegattaEstimatedFinishTime(regattaId, formatter.parse(value));
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void addRegattaCommand(Scanner scanner) {
		if (!scanner.hasNext()) {
			OUT.println(MISSINGID);
			printTUI();
		} else {
			controller.addRegatta(scanner.next());
		}
	}
	
	private void changeNameCommand(Scanner scanner) {
		String regattaId;
		String value;
		
		if(!scanner.hasNext()) {
			OUT.println(MISSINGID);
			printTUI();
			return;
		} else {
			regattaId = scanner.next();
		}
		
		if(!scanner.hasNext()) {
			OUT.println(MISSINGVALUE);
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
			OUT.println(MISSINGID);
			printTUI();
			return;
		} else {
			regattaId = scanner.next();
		}
		
		if(!scanner.hasNext()) {
			OUT.println(MISSINGVALUE);
			printTUI();
			return;
		} else {
			value = scanner.next();
		}
		controller.setRegattaHost(regattaId, value);
	}

	private void printCommand(Scanner scanner) {
		if (!scanner.hasNext()) {
			OUT.println(MISSINGID);
		} else {
			OUT.println(controller.getRegattaString(scanner.next()));
		}
		printTUI();
	}
	
	@Override
	public void printTUI() {

		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("RegattaDemo: ").append("\n");
		sb.append("a <ID>        - add Regatta with specified ID").append("\n");
		sb.append("n <ID> <NAME> - set Name of Regatta with ID = <ID>").append("\n");
		sb.append("h <ID> <HOST> - set Host of Regatta with ID = <ID>").append("\n");
		sb.append("s <ID>		 - set estimated Start Time of Regatta with ID = <ID>").append("\n");
		sb.append("f <ID> 		 - set estimated Finish Time of Regatta with ID = <ID>").append("\n");
		sb.append("p <ID>        - print Data of Regatta with ID = <ID>").append("\n");
		sb.append("q             - End this Demo").append("\n");
		sb.append("Please specify Dates in the following format: 'dd/MM/yyyy/HH:mm:ss'");
		sb.append("\n");
		sb.append(">>");

		OUT.print(sb.toString());
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

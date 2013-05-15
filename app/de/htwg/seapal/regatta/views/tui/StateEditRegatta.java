package de.htwg.seapal.regatta.views.tui;

import java.io.PrintStream;
import java.util.Scanner;

import de.htwg.seapal.common.views.tui.StateContext;
import de.htwg.seapal.common.views.tui.TuiState;

public class StateEditRegatta implements TuiState {
	
	private static final String UNKNOWNCOMMAND = "Unknown Command! Please try again ...";
	private static final String MISSINGID = "Missing ID! Please try again ...";
	private static final String MISSINGVALUE = "Missing value! Please try again ...";
	private static final PrintStream OUT = System.out;
	private final String id;

	public StateEditRegatta(String id) {
		this.id = id;
	}

	@Override
	public void print() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("RegattaDemo: Add Regatta Menu").append("\n");
		sb.append("n <NAME> - set Name of Regatta with ID = <ID>").append("\n");
		sb.append("h <HOST> - set Host of Regatta with ID = <ID>").append("\n");
		sb.append("s <DATE> - set estimated Start Time of Regatta with ID = <ID>").append("\n");
		sb.append("f <DATE> - set estimated Finish Time of Regatta with ID = <ID>").append("\n");
		sb.append("b        - Go back to main menu").append("\n");
		sb.append("Please specify Dates in the following format: 'dd/MM/yyyy/HH:mm:ss'");
		sb.append("\n");
		sb.append(">>");

		OUT.print(sb.toString());
	}

	@Override
	public boolean process(StateContext state, String line) {
		boolean continu = true;

		char command;
		String[] commandLine;
		commandLine = line.split(" ");

		if (commandLine[0].length() != 1) {
			OUT.println(UNKNOWNCOMMAND);
			print();
			return continu;
		}

		command = commandLine[0].charAt(0);
/*
		switch (command) {

		case 'n':
			changeNameCommand(scanner);
			break;

		case 'h':
			changeHostCommand(scanner);
			break;

		case 's':
			changeRegattaEstimatedStartTime(scanner);
			break;

		case 'f':
			changeRegattaEstimatedFinishTime(scanner);
			break;
			
		case 'b':
			break;

		default:
			OUT.println(UNKNOWNCOMMAND);
			print();
		}*/

		return continu;
	}
}

package de.htwg.seapal.regatta.views.tui;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import de.htwg.seapal.common.views.tui.StateContext;
import de.htwg.seapal.common.views.tui.TuiState;
import de.htwg.seapal.regatta.controllers.IRegattaController;

public class StateEditRegatta implements TuiState {

	private static final String UNKNOWNCOMMAND = "Unknown Command! Please try again ...";
	private static final String MISSINGID = "Missing ID! Please try again ...";
	private static final String MISSINGVALUE = "Missing value! Please try again ...";
	private static final PrintStream OUT = System.out;
	private final String id;
	private final IRegattaController controller;

	public StateEditRegatta(IRegattaController controller, String id) {
		this.id = id;
		this.controller = controller;
	}

	@Override
	public void print() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("RegattaDemo: Add Regatta Menu").append("\n");
		sb.append("n <NAME> - set Name of Regatta with ID = <ID>").append("\n");
		sb.append("h <HOST> - set Host of Regatta with ID = <ID>").append("\n");
		sb.append(
				"s <DATE> - set estimated Start Time of Regatta with ID = <ID>")
				.append("\n");
		sb.append(
				"f <DATE> - set estimated Finish Time of Regatta with ID = <ID>")
				.append("\n");
		sb.append("b        - Go back to main menu").append("\n");
		sb.append("Please specify Dates in the following format: 'dd/MM/yyyy/HH:mm:ss'");
		sb.append("\n");
		sb.append(">>");

		OUT.print(sb.toString());
	}

	@Override
	public boolean process(StateContext state, String line) {
		char command;
		String value = null;	
		String[] commandLine;
		commandLine = line.split(" ");

		if(commandLine[0].length() != 1) {
			OUT.println(UNKNOWNCOMMAND);
			print();
			return true;
		}
		
		command = commandLine[0].charAt(0);
		
		if (command != 'b') {
			if(commandLine.length <= 1) {
				OUT.println(MISSINGVALUE);
				print();
				return true;
			} else {
				value = commandLine[1];
			}
		}

		switch (command) {

		case 'n':
			controller.setRegattaName(id, value);
			break;

		case 'h':
			controller.setRegattaHost(id, value);
			break;

		case 's':
			changeRegattaEstimatedStartTime(value);
			break;

		case 'f':
			changeRegattaEstimatedFinishTime(value);
			break;

		case 'b':
			state.setState(new StateMainMenu(controller));
			return true;

		default:
			OUT.println(UNKNOWNCOMMAND);
			print();
		}

		return true;
	}

	private void changeRegattaEstimatedStartTime(String value) {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy/hh:mm:ss");
		try {
			controller
					.setRegattaEstimatedFinishTime(id, formatter.parse(value));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void changeRegattaEstimatedFinishTime(String value) {

		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy/hh:mm:ss");
		try {
			controller.setRegattaEstimatedFinishTime(id,
					formatter.parse(value));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

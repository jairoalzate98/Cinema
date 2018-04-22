package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import models.Cinema;
import models.Client;
import views.MainWindow;

public class Controller implements ActionListener{

	private Cinema cinema;
	private MainWindow mainWindow;
	private Timer timer;
	private int time;
	
	public Controller() {
		cinema = new Cinema();
		mainWindow = new MainWindow(this);
		timer = new Timer(25, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (time == 100) {
					cinema.addClient(new Client(mainWindow.getWidhtPanel(), mainWindow.getHeightPanel()));
					time = 0;
				}
				time++;
				cinema.verifyMove();
				mainWindow.addCliente(cinema.getClientListToSend());
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Events.valueOf(e.getActionCommand())) {
		case GENERATE_REPORT:
			generateReport();
			break;
		case INIT_SIMULATION:
			initSimulation();
			break;
		case STOP_SIMULATION:
			stopSimulation();
			break;
		}
	}

	private void stopSimulation() {
		timer.stop();
	}

	private void initSimulation() {
		String number = JOptionPane.showInputDialog(mainWindow, "ingrese el numero de salas");
		mainWindow.initsimulation(Integer.parseInt(number));
		cinema.setRoomList(mainWindow.getRooms());
		Client c = new Client(mainWindow.getWidhtPanel(), mainWindow.getHeightPanel());
		cinema.addClient(c);
		mainWindow.addCliente(cinema.convertToArrayList());
		timer.start();
	}

	private void generateReport() {
		// TODO Auto-generated method stub
	}
}
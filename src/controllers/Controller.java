package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import models.Cinema;
import views.MainWindow;

public class Controller implements ActionListener{

	private Cinema cinema;
	private MainWindow mainWindow;
	private Timer timer;
	
	public Controller() {
		cinema = new Cinema();
		mainWindow = new MainWindow(this);
		timer = new Timer(5, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
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
		timer.start();
	}

	private void generateReport() {
		// TODO Auto-generated method stub
	}
}
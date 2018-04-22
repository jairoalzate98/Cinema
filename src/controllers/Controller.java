package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import models.Cinema;
import models.Client;
import models.MovieView;
import views.MainWindow;

public class Controller implements ActionListener{

	private Cinema cinema;
	private MainWindow mainWindow;
	private Timer timer;
	private int time;
	private int numberClient;

	public Controller() {
		cinema = new Cinema();
		mainWindow = new MainWindow(this);
		timer = new Timer(5, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (numberClient > 0) {
					if (time == 100) {
						cinema.addClient(new Client(mainWindow.getWidhtPanel(), mainWindow.getHeightPanel()));
						time = 0;
						numberClient--;
					}
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
		cinema.getMovieViews();
	}

	private void initSimulation() {
		String number = JOptionPane.showInputDialog(mainWindow, "ingrese el numero de salas");
		numberClient =Integer.parseInt(JOptionPane.showInputDialog(mainWindow, "ingrese el numero de clientes"));
		mainWindow.initsimulation(Integer.parseInt(number));
		cinema.setRoomList(mainWindow.getRooms());
		Client c = new Client(mainWindow.getWidhtPanel(), mainWindow.getHeightPanel());
		cinema.addClient(c);
		numberClient--;
		mainWindow.addCliente(cinema.convertToArrayList());
		timer.start();
	}

	private void generateReport() {
		ArrayList<MovieView> list = cinema.getMovieViewList();
		for (MovieView movieView : list) {
			cinema.addToTree(movieView);
		}
		mainWindow.generateReport(cinema.getMovieViewList(), cinema.getRoot());
	}
}
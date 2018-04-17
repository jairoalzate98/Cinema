package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.Cinema;
import views.MainWindow;

public class Controller implements ActionListener{

	private Cinema cinema;
	private MainWindow mainWindow;
	
	public Controller() {
			cinema = new Cinema();
			mainWindow = new MainWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Events.valueOf(e.getActionCommand())) {
		
		}
	}
}
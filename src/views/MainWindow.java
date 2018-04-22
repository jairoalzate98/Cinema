package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import controllers.Controller;
import models.Client;
import models.Room;

public class MainWindow extends JFrame{

	public static final String TITLE_TEXT = "Cinema Simulation";
	private static final long serialVersionUID = 1L;
	private JPanelCinemaWelcome jPanelCinemaWelcome;
	private JPanelInitSimulation jPanelInitSimulation;

	public MainWindow(Controller controller) {
		setTitle(TITLE_TEXT);
		setBackground(Color.WHITE);
		ImageIcon icon = new ImageIcon(getClass().getResource("/img/iconoAplicacion.png"));
		setIconImage(icon.getImage());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setJMenuBar(new JMBMainWindow(controller));
		jPanelCinemaWelcome = new JPanelCinemaWelcome();
		add(jPanelCinemaWelcome, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public void initsimulation(int roomNumber){
		remove(jPanelCinemaWelcome);
		jPanelInitSimulation = new JPanelInitSimulation(roomNumber);
		add(jPanelInitSimulation, BorderLayout.CENTER);
		revalidate();
		repaint();
	}
	
	public ArrayList<Room> getRooms(){
		return jPanelInitSimulation.getRooms(); 
	}
	
	public int getWidhtPanel(){
		return jPanelInitSimulation.getWidth();
	}
	
	public int getHeightPanel(){
		return jPanelInitSimulation.getHeight();
	}
	
	public void addCliente(ArrayList<Client> client){
		jPanelInitSimulation.setClient(client);
		revalidate();
		repaint();
	}
}

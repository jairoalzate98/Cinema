package views;

import javax.swing.JFrame;

import controllers.Controller;

public class MainWindow extends JFrame{

	public static final String TITLE_TEXT = "Cinema Simulation";
	private static final long serialVersionUID = 1L;

	public MainWindow(Controller controller) {
		setTitle(TITLE_TEXT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setJMenuBar(new JMBMainWindow(controller));
		setVisible(true);
	}
}

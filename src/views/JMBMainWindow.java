package views;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controllers.Controller;
import controllers.Events;

public class JMBMainWindow extends JMenuBar {

	public static final String REPORT_TREE_TEXT = "Report tree";
	public static final String REPORTS_TEXT = "Reports";
	public static final String STOP_SIMUALTION_TEXT = "Stop Simualtion";
	public static final String INIT_SIMULATION_TEXT = "Init Simulation";
	public static final String FILE_TEXT = "File";
	private static final long serialVersionUID = 1L;

	public JMBMainWindow(Controller controller) {
		JMenu jmFile = new JMenu(FILE_TEXT);
		JMenuItem jmiInitSimulation = new JMenuItem(INIT_SIMULATION_TEXT);
		jmiInitSimulation.setActionCommand(Events.INIT_SIMULATION.toString());
		jmiInitSimulation.addActionListener(controller);
		jmFile.add(jmiInitSimulation);
		JMenuItem jmiStopSimulation = new JMenuItem(STOP_SIMUALTION_TEXT);
		jmiStopSimulation.setActionCommand(Events.STOP_SIMULATION.toString());
		jmiStopSimulation.addActionListener(controller);
		jmFile.add(jmiStopSimulation);
		add(jmFile);
		JMenu jmReport = new JMenu(REPORTS_TEXT);
		JMenuItem jmiReport = new JMenuItem(REPORT_TREE_TEXT);
		jmiReport.setActionCommand(Events.GENERATE_REPORT.toString());
		jmiReport.addActionListener(controller);
		jmReport.add(jmiReport);
		add(jmReport);
	}
}
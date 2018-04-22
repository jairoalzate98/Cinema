package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.MovieView;

public class JPanelTable extends JPanel {

	private static final long serialVersionUID = 1L;
	private DefaultTableModel model;
	private JTable table;
	
	public JPanelTable() {
		setBackground(Color.WHITE);
		model = new DefaultTableModel();
		model.setColumnIdentifiers(new Object[]{"idClient", "idRoom"});
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		js.setPreferredSize(new Dimension(120, 700));
		add(js, BorderLayout.CENTER);
	}
	
	public void setModel(ArrayList<MovieView> movieViews){
		model.setRowCount(0);
		for (MovieView movieView : movieViews) {
			model.addRow(movieView.toArray());
		}
	}
}
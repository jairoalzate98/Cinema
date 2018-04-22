package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

import models.MovieView;

public class JPanelTree extends JPanel{

	private static final long serialVersionUID = 1L;
	private JTree jTree;
	private DefaultMutableTreeNode model;

	public JPanelTree() {
		setBackground(Color.WHITE);
		model = new DefaultMutableTreeNode();
		jTree = new JTree(model);
		JScrollPane js = new JScrollPane(jTree);
		js.setPreferredSize(new Dimension(800, 680));
		add(js, BorderLayout.CENTER);
	}
	
	public void paintTree(MovieView root) {
		System.out.println(root.getMovieViews().size());
		model.removeAllChildren();
		DefaultMutableTreeNode uiRoot = new DefaultMutableTreeNode(root);
		model.add(uiRoot);
		for (int i = 0; i < root.getMovieViews().size(); i++) {
			createNode(uiRoot, root.getMovieViews().get(i));
		}
		fillTree();
	}
	
	private void createNode(DefaultMutableTreeNode actual, MovieView node) {
		if (node != null) {
			DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(node);
			actual.add(newNode);
			for (int i = 0; i < node.getMovieViews().size(); i++) {
				createNode(newNode, node.getMovieViews().get(i));
			}
		}
	}

	public void fillTree() {
		for (int i = 0; i < jTree.getRowCount(); i++) {
			jTree.expandRow(i);
		}
	}
}
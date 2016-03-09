package ui;

import javax.swing.JFrame;

import uiComponents.Menu;

public class Test {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame(frame);
		Menu.createMenu(frame);
	}
	public static void frame(JFrame frame){
		frame.setVisible(true);
		frame.setBounds(300, 150, 800, 600);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	}

}

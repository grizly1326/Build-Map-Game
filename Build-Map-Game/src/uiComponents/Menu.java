package uiComponents;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Menu {
	//if menu is not needed make it invisible.
	static JPanel panel=new JPanel();
	public static void createMenu(JFrame frame) {
		panel.setVisible(true);
		panel.setBackground(Color.cyan);
		panel.setBounds(10, 10, frame.getWidth()-40, frame.getHeight()-40);		//change this to procedrual in the middle.
		frame.add(panel);
		callComponents();
	}
	public static void toggleVisibility(boolean choice){
		panel.setVisible(choice);
	}
	private static void callComponents(){
		createPlay();
	}
	private static void createPlay(){
		JButton play = new JButton();
		play.setVisible(true);
		play.setText("Play");
		play.setBounds(10, 10, panel.getWidth()-30, 50);
		panel.add(play);
	}

}

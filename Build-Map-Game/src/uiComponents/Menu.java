package uiComponents;


import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import menuActionListeners.MenuSettingsListener;

public class Menu{
	//if menu is not needed make it invisible.
	static int numberOfBlocks=0;
	static JPanel panel=new JPanel();
	public static void createMenu(JFrame frame) {
		panel.setVisible(true);
		panel.setBackground(Color.darkGray);
		panel.setLayout(null);
		panel.setBounds(10, 10, frame.getWidth()-40, frame.getHeight()-40);		//change this to procedrual in the middle.
		frame.add(panel);
		callComponents();
		System.out.println("Frame");
	}
	public static void toggleVisibility(boolean choice){
		panel.setVisible(choice);
	}
	private static void callComponents(){
		createPlay();
		createSettings();
		createExit();
	}
	private static void createPlay(){
		JButton play = new JButton();
		play.setVisible(true);
		play.setText("Play");
		play.setBounds(10, numberOfBlocks*50, panel.getWidth()-30, 50);
		panel.add(play);
	}
	private static void createExit(){
		numberOfBlocks++;
		JButton exit= new JButton();
		exit.setVisible(true);
		exit.setText("Exit");
		exit.setBounds(10, numberOfBlocks*50, panel.getWidth()-30, 50);
		panel.add(exit);
	}
	private static void createSettings(){
		numberOfBlocks++;
		JButton settings=new JButton();
		settings.setVisible(true);
		settings.setBounds(10, numberOfBlocks*50, panel.getWidth()-30, 50);
		settings.setText("Settings");
		settings.addActionListener(new MenuSettingsListener());
		panel.add(settings);
	}
}

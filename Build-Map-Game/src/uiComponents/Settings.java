package uiComponents;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import menuActionListeners.SettingsBackListener;

public class Settings{
	static int numberOfBlocks=0;
	static JPanel panel=new JPanel();
	public static void createMenu(JFrame frame) {
		panel.setVisible(false);
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
		createBack();
	}
	private static void createBack(){
		JButton back=new JButton();
		back.setVisible(true);
		back.setText("Back");
		back.setBounds(10, numberOfBlocks*50, panel.getWidth()-30, 50);
		back.addActionListener(new SettingsBackListener());
		panel.add(back);
	}
}

package uiComponents;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fieldActionListener.KeyStrokes;
import fieldActionListener.MouseEvents;

public class Play {
	static JPanel panel=new JPanel();
	public static void createField(JFrame frame){
		panel.setVisible(false);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		panel.setBounds(0, 0, frame.getWidth(), frame.getHeight());		//change this to procedrual in the middle.
		panel.addKeyListener(new KeyStrokes());
		panel.addMouseListener(new MouseEvents());
		frame.add(panel);
	}
	public static void toggleVisibility(boolean choice){
		panel.setVisible(choice);
	}
	public static JPanel getPanel(){
		return panel;
	}
}

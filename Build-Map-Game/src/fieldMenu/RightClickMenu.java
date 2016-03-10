package fieldMenu;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

import fieldRightClickMenuActionListener.BuildListener;
import fieldRightClickMenuActionListener.ExitListener;

public class RightClickMenu {
	static JPanel panel=new JPanel();
	static int numberOfBlocks=0;
	static int bHeight=50;
	static int bWidth=100;
	public static void createMenu(JPanel frame){
		System.out.println(frame.getHeight());
		panel.setBackground(Color.blue);
		panel.setVisible(false);
		panel.setLayout(null);
		callComponents();
		panel.setSize(bWidth, numberOfBlocks*bHeight);
		frame.add(panel);
	}
	public static void moveToLocation(int x, int y){
		panel.setLocation(x, y);
	}
	public static void toggleVisibility(boolean choice){
		panel.setVisible(choice);
	}
	private static void callComponents(){
		buildButton();
		exitButton();
	}
	private static void exitButton(){
		JButton exit= new JButton();
		exit.setText("Exit");
		exit.setVisible(true);
		exit.setBounds(0, numberOfBlocks*bHeight, bWidth, bHeight);
		exit.addActionListener(new ExitListener());
		numberOfBlocks++;
		panel.add(exit);
	}
	private static void buildButton(){
		JButton exit= new JButton();
		exit.setText("Build");
		exit.setVisible(true);
		exit.setBounds(0, numberOfBlocks*bHeight, bWidth, bHeight);
		exit.addActionListener(new BuildListener());
		numberOfBlocks++;
		panel.add(exit);
	}
}

package fieldRightClickMenuBuild;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import buildings.Building;
import buildings.BuildingList;
import fieldRightClickMenuBuildActionListener.BuildingsListener;
import fieldRightClickMenuBuildActionListener.ExitListener;

public class Buildings{
	static JPanel panel= new JPanel();
	static int numberOfBlocks=0;
	static int bHeight=50;
	static int bWidth=100;
	static int pHeight=150;
	static int sWidth=20;
	public static void createMenu(JPanel frame){
		//scroller
		JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.setBounds(bWidth, 0, sWidth, numberOfBlocks*bHeight);
        //panel
		panel.setBackground(Color.blue);
		panel.setVisible(false);
		panel.setLayout(null);
		panel.setPreferredSize(new Dimension(bHeight*3,bWidth+sWidth));
		callComponents();
		panel.setSize(bWidth, numberOfBlocks*bHeight);
		frame.add(panel);
	}
	public static void moveToLocation(Point point){
		panel.setLocation(point);
	}
	public static Point getLocation() {
		return panel.getLocation();
	}
	public static void toggleVisibility(boolean choice){
		panel.setVisible(choice);
	}
	private static void callComponents(){
		buildingButtons();
		exitButton();
	}
	private static void buildingButtons(){
		System.out.println("generated");
		for(Building b:BuildingList.getList()){
			System.out.println("generated");
			JButton button= new JButton();
			button.setVisible(true);
			button.setText(b.getName());
			button.setBounds(0, numberOfBlocks*bHeight, bWidth-sWidth, bHeight);
			button.addActionListener(new BuildingsListener());
			numberOfBlocks++;
			panel.add(button);
		}
	}
	private static void exitButton(){
		JButton exit= new JButton();
		exit.setText("Exit");
		exit.setVisible(true);
		exit.setBounds(0, numberOfBlocks*bHeight, bWidth-sWidth, bHeight);
		exit.addActionListener(new ExitListener());
		numberOfBlocks++;
		panel.add(exit);
	}
}

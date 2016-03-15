package buildings;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import uiComponents.Play;

public class MainBuilding implements Building{
	int health=1000;
	String name="MainBuilding";
	JButton model=new JButton();
	public MainBuilding(int x, int y){
		model.setBackground(Color.BLACK);
		model.setForeground(Color.WHITE);
		model.setFont(new Font("Dialog", Font.BOLD, 10));
		model.setText("MainBuilding");
		model.setVisible(true);
		model.setBounds(x, y, 100, 100);
		Play.getPanel().add(model);
		Play.getPanel().repaint();
	}
	public int getHeatlh(){
		return health;
	}
	public String getName() {
		return name;
	}
	public void toggleVisibility(boolean toggle) {
		model.setVisible(toggle);
	}
}

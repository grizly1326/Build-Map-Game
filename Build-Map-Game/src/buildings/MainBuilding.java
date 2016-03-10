package buildings;

import java.awt.Color;
import java.awt.Graphics;

import uiComponents.Play;

public class MainBuilding {
	
	public MainBuilding(){
		
	}
	public static void position(int x, int y){
		Graphics g=Play.getPanel().getGraphics();
		g.setColor(Color.BLACK);
		g.fillRect(x, y, 50, 50);
	}
}

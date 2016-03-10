package Load;

import javax.swing.JFrame;

import ui.Test;
import uiComponents.Menu;
import uiComponents.Play;
import uiComponents.Settings;

public class Initilize {
	public static void preInit(JFrame frame){
		Test.frame(frame);
		Menu.createMenu(frame);
		Menu.toggleVisibility(true);
		Settings.createMenu(frame);
	}
	public static void init(){
	}
	public static void postInit(){
		
	}
}

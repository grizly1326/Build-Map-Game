package load;

import javax.swing.JFrame;
import javax.swing.JPanel;

import buildings.BuildingList;
import fieldMenu.RightClickMenu;
import fieldRightClickMenuBuild.Buildings;
import player.Player;
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
		Play.createField(frame);				//probobly can be moved somewhere else for instance init.
	}
	public static void init(JPanel panel){			//in game initilize.
		PlayerList.addPlayer(new Player("Daniel"));
		BuildingList.initList();
		RightClickMenu.createMenu(panel);
		Buildings.createMenu(panel);
	}
	public static void postInit(){
		
	}
}

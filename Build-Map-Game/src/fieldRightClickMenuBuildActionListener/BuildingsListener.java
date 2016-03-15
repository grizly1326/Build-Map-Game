package fieldRightClickMenuBuildActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import buildings.Building;
import buildings.BuildingList;
import load.PlayerList;

public class BuildingsListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b=(JButton)e.getSource();
		for(int i=0;i<BuildingList.getList().size();i++){
			switch(i){
			case 0: PlayerList.getPlayer("Daniel").setSelectedBuilding(BuildingList.getList().get(0));break;
			case 1: break;
			}
		}
	}

}

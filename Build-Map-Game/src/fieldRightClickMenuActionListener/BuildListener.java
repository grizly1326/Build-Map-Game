package fieldRightClickMenuActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fieldMenu.RightClickMenu;
import fieldRightClickMenuBuild.Buildings;
import uiComponents.Play;

public class BuildListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		RightClickMenu.toggleVisibility(false);
		Buildings.toggleVisibility(true);
		Buildings.moveToLocation(RightClickMenu.getLocation());
		//change left click to something else, or open specific buildings "window".
	}

}

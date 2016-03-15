package fieldActionListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import buildings.Building;
import fieldMenu.RightClickMenu;
import load.PlayerList;

public class MouseEvents implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent arg0) {
		//make PanelField as public or pass it to here.
		Building b=PlayerList.getPlayer("Daniel").getSelectedBuilding();
		switch(arg0.getButton()){
		case 1:System.out.println("Left clik");break;
		case 2:System.out.println("Mouse wheel click");break;
		case 3:System.out.println("Right click");RightClickMenu.moveToLocation(arg0.getPoint());RightClickMenu.toggleVisibility(true);break;
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

}

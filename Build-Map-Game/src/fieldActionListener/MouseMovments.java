package fieldActionListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import buildings.MainBuilding;
import fieldMenu.RightClickMenu;

public class MouseMovments implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent arg0) {
		//make PanelField as public or pass it to here.
		switch(arg0.getButton()){
		case 1:System.out.println("Left clik");MainBuilding.position(arg0.getX(), arg0.getY());;break;
		case 2:System.out.println("Mouse wheel click");break;
		case 3:System.out.println("Right click");RightClickMenu.moveToLocation(arg0.getX(), arg0.getY());RightClickMenu.toggleVisibility(true);break;
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

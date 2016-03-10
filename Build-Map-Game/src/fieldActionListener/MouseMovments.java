package fieldActionListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import fieldMenu.RightClickMenu;

public class MouseMovments implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent arg0) {
		//make PanelField as public or pass it to here.
		switch(arg0.getButton()){
		case 1:System.out.println("Left clik"); break;
		case 2:System.out.println("Mouse wheel click");break;
		case 3:System.out.println("Right click");RightClickMenu.createMenu((JPanel)arg0.getSource(), arg0.getX(), arg0.getY());break;
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
		switch(arg0.getButton()){
		case 1:System.out.println("Left press"); break;
		case 2:System.out.println("Mouse wheel press");break;
		case 3:System.out.println("Right press");break;
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		switch(arg0.getButton()){
		case 1:System.out.println("Left release"); break;
		case 2:System.out.println("Mouse wheel release");break;
		case 3:System.out.println("Right release");break;
		}
	}

}

package fieldRightClickMenuBuildActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fieldRightClickMenuBuild.Buildings;

public class ExitListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent arg0) {
		Buildings.toggleVisibility(false);
	}
}

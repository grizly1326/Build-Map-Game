package fieldRightClickMenuActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fieldMenu.RightClickMenu;

public class ExitListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent arg0) {
		RightClickMenu.toggleVisibility(false);
	}

}

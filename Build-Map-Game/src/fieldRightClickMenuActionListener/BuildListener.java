package fieldRightClickMenuActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import fieldMenu.RightClickMenu;

public class BuildListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		RightClickMenu.toggleVisibility(false);
		//change left click to something else, or open specific buildings "window".
	}

}

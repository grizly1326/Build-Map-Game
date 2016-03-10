package menuActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Load.Initilize;
import uiComponents.Menu;
import uiComponents.Play;

public class PlayListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		Menu.toggleVisibility(false);
		Play.toggleVisibility(true);
		Initilize.init(Play.getPanel());
	}

}

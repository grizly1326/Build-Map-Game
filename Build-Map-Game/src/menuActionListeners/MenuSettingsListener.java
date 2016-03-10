package menuActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import uiComponents.Menu;
import uiComponents.Settings;

public class MenuSettingsListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		Menu.toggleVisibility(false);
		Settings.toggleVisibility(true);
	}

}

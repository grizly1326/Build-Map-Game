package menuActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import uiComponents.Menu;
import uiComponents.Settings;

public class SettingsBackListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		Menu.toggleVisibility(true);
		Settings.toggleVisibility(false);
	}

}

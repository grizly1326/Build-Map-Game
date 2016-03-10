package fieldActionListener;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyStrokes implements KeyListener{
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("KEY");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("KEY");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("KEY");
	}

}

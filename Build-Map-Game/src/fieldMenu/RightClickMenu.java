package fieldMenu;

import javax.swing.JButton;
import javax.swing.JPanel;

public class RightClickMenu {
	static JPanel panel=new JPanel();
	static int numberOfBlocks=0;
	static int bHeight=50;
	static int bWidth=100;
	public static void createMenu(JPanel frame,int x, int y){
		panel.setVisible(false);
		panel.setLayout(null);
		callComponents();
		panel.setBounds(x, y, numberOfBlocks*bHeight, bWidth);
		frame.add(panel);
		
	}
	private static void callComponents(){
		exitButton();
	}
	private static void exitButton(){
		JButton exit= new JButton();
		exit.setText("Exit");
		exit.setVisible(true);
		exit.setBounds(0, numberOfBlocks*bHeight, bHeight, bWidth);
		panel.add(exit);
	}
}

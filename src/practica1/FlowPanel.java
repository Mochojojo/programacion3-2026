package practica1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FlowPanel extends JPanel{
	public FlowPanel() {
		JButton buttons[] = new JButton[10];
		setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 20));
		
		for(int i = 0; i < 10; i++) {
			buttons[i] = new JButton(i + " ");
			add(buttons[i]);
		}
	}
}

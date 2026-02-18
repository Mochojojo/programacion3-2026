package practica1;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BoxPanel extends JPanel{
	public BoxPanel() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(Box.createHorizontalGlue());
		
		for(int i = 0; i < 3; i++) {
			JButton b = new JButton(i+"");
			add(b);
			add(Box.createVerticalGlue());
		}
	}
}

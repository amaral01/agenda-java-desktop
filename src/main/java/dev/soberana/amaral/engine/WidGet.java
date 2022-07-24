package dev.soberana.amaral.engine;

import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class WidGet {
	private JInternalFrame frame;

	public WidGet() {
		

	}
	
	public WidGet(JInternalFrame jInternalFrame) {
		// TODO Auto-generated constructor stub
		this.frame = jInternalFrame;
	}

	public void create(JPanel panel,JLabel lb, JTextField tf,final String txt) {

			JLabel label = new JLabel(txt);
			label.setHorizontalAlignment(JLabel.CENTER);
		    panel.add(label);
		    panel.setPreferredSize(new Dimension(300, 30));
		    frame.pack();
		  }
			// TODO Auto-generated constructor stub
}
		// TODO Auto-generated constructor stub

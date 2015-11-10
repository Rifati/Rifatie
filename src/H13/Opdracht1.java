package H13;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {
	
	String text = "";
	
	public void init() {
		setSize(400, 400);
		buttons();
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		
		g.drawString(""+ text, x/2-10, y/2);
	}
	
	void buttons() {
		Color[] colors = {Color.blue, Color.black, Color.red, Color.yellow, Color.green};
		String[] strings = {"blue", "black", "red", "yellow", "green"};
		Button[] buttons = new Button[colors.length];
		for (int i = 0; i < colors.length; i++) {
			buttons[i] = new Button(strings[i]);
			add(buttons[i]);
			buttons[i].addActionListener(new ColorListener());
			buttons[i].setBackground(colors[i]);
		}
	}
	
	class ColorListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Button src = (Button)e.getSource();
			setBackground(src.getBackground());
			text = src.getLabel();
			repaint();
		}
	}

}
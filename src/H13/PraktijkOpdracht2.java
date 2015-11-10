package H13;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class PraktijkOpdracht2 extends Applet {
	
	public void init() {
		setSize(800, 800);
	}
	
	public void paint(Graphics g) {
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j++) {
				drawTree(g, 50+100*j, 200+200*i);
				
			}
		}
	}
	
	void drawTree(Graphics g, int x, int y) {
		int d = y/200;
		int[] xPoints = {x, x+d, x-d*8, x+d*2, x+d*3, x+d*4, x+d*14, x+d*4, x+d*9};
		int[] yPoints = {y, y-d*14, y-d*34, y-d*18, y-d*36, y-d*25, y-d*34, y-d*22, y};
		g.setColor(new Color(185, 75, 5));
		g.fillPolygon(xPoints, yPoints, 9);
		g.setColor(Color.green);
		g.fillOval(x-d*14, y-d*39, d*18, d*14);
		g.fillOval(x-d*3, y-d*40, d*16, d*13);
		g.fillOval(x+d*4, y-d*39, d*16, d*12);
		
	}
}
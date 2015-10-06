package H11;

import java.awt.*;
import java.applet.*;


public class Opdracht2 extends Applet {
	
    public void init() {}

    public void paint(Graphics g) {
        int teller = 1;
        int y = 0;
		int getal = 10;
        while(teller < 12) {
            y += 20;
            g.drawString("" + getal, 10, y );
            getal++;
            teller++;
        }
    }
}
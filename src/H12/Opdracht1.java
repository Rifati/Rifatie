package H12;



	import java.awt.*;
	import java.applet.*;

	public class Opdracht1 extends Applet {
	    int Cijfer[];
		
	    public void init() {
	        Cijfer = new int [10];
			
	        for (int teller = 0; teller < Cijfer.length; teller ++) {
	            Cijfer[teller] = 15 * teller + 1;
	        }
	    }

	    public void paint(Graphics g) {
	        for (int teller = 0; teller < Cijfer.length; teller ++) {
	            g.drawString("" + Cijfer[teller], 50, 20 * teller + 20);
	        }
	    }
	}


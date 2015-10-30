package H12;

import java.applet.Applet;
import java.awt.Graphics;

public class Opdracht4 extends Applet {

	
	
    double[] salaris;
    double gemiddelde;

public void init() {
	setSize(500,200);
	salaris = new double[5];

	
	for (int i = 0; i < 5; i++) {
		  salaris[i] = 100 * i + 100;
		  

	}
	 
 }



public void paint(Graphics g) {
	 for (int teller = 0; teller < salaris.length; teller ++) {
         g.drawString("" + salaris[teller], 50 * teller + 20, 20);
         if (salaris[teller] == 400) {
    		 break;
	 }
}
}
}
package H6;

import java.awt.*;
import java.applet.*;


public class Opdracht1 extends Applet {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int a;
  int b, uitkomst;

  public void init() {
      a = 113;
      b = 4;
      uitkomst = (a / b);
  }

  public void paint(Graphics g) {
      g.drawString("Jan krijgt" + uitkomst, 20, 30);
      g.drawString("Ali krijgt" + uitkomst, 20, 60);
      g.drawString("Jeannette krijgt" + uitkomst, 20, 90);
      g.drawString("Rifati krijgt" + uitkomst, 20, 120);
  }
}
package H6;

import java.awt.*;
import java.applet.*;


public class Opdracht3 extends Applet {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int a;
    int b;
    int c;
    int uitkomst;

  public void init() {
      a = 2000000000;
      b = 200000000;
      c = 2;
      uitkomst = (a * b * c);
  }

  public void paint(Graphics g) {
      g.drawString("De uitkomst is" + uitkomst, 20, 30);
}
}
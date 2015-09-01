package H6;

import java.awt.*;
import java.applet.*;


public class Opdracht2 extends Applet {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int a, b, c ,d , uitkomst;

  public void init() {
      a = 60;
      b = 60;
      c = 24;
      d = 365;
      uitkomst = a * b *c* d;
  }

  public void paint(Graphics g) {
      g.drawString("Er zitten" + uitkomst+" second in 1 jaar", a, a);
  

  }
}

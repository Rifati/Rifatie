package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Opdracht4 extends Applet {
    TextField tekstvak;
    Label label;				
    String s, tekst;
    int jaar;
	
    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het jaartal en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g) {
    	setSize(500, 400);
        g.drawString(tekst, 50, 60 );
    }
	
    class TekstvakListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
    s = tekstvak.getText();
    jaar = Integer.parseInt( s);
    if ( (jaar % 4 == 0 && !(jaar % 100 == 0)) || 
    jaar % 400 == 0 ) {
    tekst = ""+ jaar + " is een schrikkeljaar";
            }
    else {
    tekst = ""+ jaar + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
}
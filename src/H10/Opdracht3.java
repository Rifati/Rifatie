package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class Opdracht3 extends Applet {
    TextField tekstvak;
    Label label;				
    String s, tekst;
    int dag;
	
    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Type het dagnummer en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        tekst = "";
        add(label);
        add(tekstvak);
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60 );
    }
	
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            dag = Integer.parseInt( s);
            switch(dag) {
                case 1:
                    tekst = "Januari : 31 Dagen";
                    break;
                case 2:
                    tekst = "Febuari : 28 Dagen";
                    break;
                case 3:
                    tekst = "Maart : 30 Dagen";
                    break;
                case 4:
                    tekst = "April : 31 Dagen";
                    break;
                case 5:
                    tekst = "Mei : 30 Dagen";
                    break;
                case 6:
                    tekst = "Juni : 31 Dagen";
                    break;
                case 7:
                    tekst = "Juli : 30 Dagen";
                    break;
                case 8:
                    tekst = "Augustus : 31 Dagen";
                    break;
                case 9:
                    tekst = "September : 30 Dagen";
                    break;
                case 10:
                    tekst = "Oktober : 31 Dagen";
                    break;
                case 11:
                    tekst = "November : 30 Dagen";
                    break;
                case 12:
                	tekst = "December : 31 Dagen";
                	break;
                    
                    default:
                    tekst = "RUNAWAY TRAIN!!!!!!!!!!";
                    break;
            }
            repaint();
        }
    }
}
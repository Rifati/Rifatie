package H10;

import java.applet.*;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Opdracht2 extends Applet {

	TextField tf;
	Button b;
	double hoogsteGetal;
	double laagsteGetal;
	double res;
	double res2;
	double num;
	double num2;
	String s;
	String s2;
	public void init() {
		setSize(500, 500);
		tf = new TextField("", 5);
		add(tf);
		b = new Button("Voer in");
		b.addActionListener(new KnopLuisteraar());
		add(b);
		hoogsteGetal = 0;
		res = 0;
		res2 = 0;
        laagsteGetal = 0; 
        s = "";
        s2 = "";
		
	}
	
	public void paint(Graphics g) {
		g.drawString("Hoogste getal: " + res, 50, 70);
		g.drawString("Hoogste getal: " + res2, 50, 90);
		
	}
	
	class KnopLuisteraar implements  ActionListener {
		
		public void actionPerformed(ActionEvent e) {

			hoogsteGetal = Double.parseDouble(tf.getText());
num = hoogsteGetal;
		if(hoogsteGetal > res)
			res = hoogsteGetal;
		
		laagsteGetal = Double.parseDouble(tf.getText());
		res2 = Double.parseDouble(tf.getText());
		
		num2 = laagsteGetal;
		if(laagsteGetal < res2)
			res2 = laagsteGetal;
			repaint ();
		}
	}
}
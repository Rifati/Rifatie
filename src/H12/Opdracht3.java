package H12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;



public class Opdracht3 extends Applet {

	
	
    Button knop;
    double[] aantal;
    int teller;
    TextField[] tekstveld;
    int teller2;
    public void init() {
	setSize(500,200);
	 tekstveld = new TextField[5];
	aantal = new double[5];
	teller = 0;
	teller2 = 0;
	int x = 20;
	int y = 20;
	
	for (int i = 0; i < 5; i++) {
            tekstveld[i] = new TextField("",10);
            tekstveld[i].addActionListener(new Actionlisteren());
            tekstveld[i].setBounds(x, y, 100, 20);               
            this.add(tekstveld[i]);
 }

}

class Actionlisteren implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		System.out.println(teller);

		
		TextField bron; e.getSource();
		aantal[teller] = Double.parseDouble(tekstveld[teller].getText());
		teller ++;
		
		
		
		if (teller == 5) {
			repaint();	
		}
		
		
	}
}
public void paint(Graphics g) {
for(int i = 0; i < aantal.length; i ++) {
	g.drawString(""+aantal[i],50 * i, 50);
}
}
}
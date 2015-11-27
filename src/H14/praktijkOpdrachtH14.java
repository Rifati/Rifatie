package H14;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class praktijkOpdrachtH14 extends Applet{

	Button ok = new Button("OK");
	Button reset = new Button("Reset");
	TextField input = new TextField("", 15);
	Label label = new Label("Hoeveel Links neem je?");
	String displayText= "";
	int linkCount = 23;
	boolean won = false;
	boolean lost = false;
	
	
	
	public void init()	{
		setSize(500, 600);
		add (ok);
		ok.addActionListener(new OKListener());
		add (reset);
		reset.addActionListener(new RESETListener());
		add (input);
		input.addActionListener(new OKListener());
		add (label);

	}
		
	
	
	public void paint(Graphics g) {
		g.setFont(new Font("Arial", Font.PLAIN, 20));
		if (won == true) {
			displayText = "You won (;";
		}
		if (lost == true) {
			displayText = "You lost (;";
			linkCount = 0;
			g.drawString(""+ displayText, getWidth()/2-75, 75);
		}
		Image img = getImage(getCodeBase(), "H14/8bitlink.png");
		int count = 0;
		for (int i = 0; i < 5; i++){
			for (int f = 0; f < 5; f++){
				if (count < linkCount ) {g.drawImage(img, 30+(50*f), 30+50*i, this);}
				count++;
				
			}
		}
		
		
	}
	class OKListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (won == false && lost == false) {
				int cpulink = 0;
				int inputInt = Integer.parseInt(input.getText());
				if (inputInt >= 1 && inputInt <= 3) { 
					linkCount -= inputInt;
					if (linkCount < 1) {lost = true;} 
					if ((linkCount-1)%4 != 0) {
						cpulink = 1+((linkCount-1)%4-1);
						linkCount -= cpulink; 
					}
					else {
						cpulink = (int)(Math.random()*3+1);
						linkCount -= cpulink;
					}
					if (linkCount < 1 && lost == false) {won = true;} 
					if (cpulink == 1) {displayText = "CPU took "+ cpulink +" links.";}
					else {displayText = "CPU took "+ cpulink +" links.";}
				}
				else {displayText = "Invalid input";}
			}
			input.setText(" ");
			input.setText("");
			input.requestFocus();
			repaint();
		}
	}
	
	class RESETListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			linkCount = 23;
			won = false;
			lost = false;
			displayText = "";
			input.setText(" ");
			input.setText("");
			input.requestFocus();
			repaint();
		}
	}
}

package H12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;

public class praktijkopdracht extends Applet {
//
	int count = 0;
	Label labelNaam = new Label("Naam: ");
	Label labelNummer = new Label("Telefoonnummer: ");
	TextField inputNaam = new TextField("", 15);
	TextField inputNummer = new TextField("", 15);
	Button ok = new Button("OK");
	String[] stringNaam = new String[10];
	String[] stringNummer = new String[10];

	
	public void init() {
		///
		setSize(600, 200+35*stringNaam.length);
		add(labelNaam);
		add(inputNaam);
		inputNaam.addActionListener(new InputListener());
		add(labelNummer);
		add(inputNummer);
		inputNummer.addActionListener(new InputListener());
		ok.addActionListener(new InputListener());
		for (int i = 0; i < stringNaam.length; i++) {
			stringNaam[i] = "";
			stringNummer[i] = "";
			add(ok);
		}
	}
	public void paint(Graphics g) {
		//Font experiment is gelukt//
		Font currentFont = new Font("Courier New", Font.BOLD+Font.ITALIC, 20);
		g.setFont(currentFont);
		///drawstring///
		int x = getWidth();
		int y = getHeight();
		
		for (int i = 0; i < stringNaam.length; i++) {
			if (count == 10) {
				///beetje struggles gekregen maar met hulp is het gelukt///
				g.drawString(""+ stringNaam[i], x/2-100, (y/2-35*stringNaam.length/2)+35*i);
				g.drawString(""+ stringNummer[i], x/2-100, (y/2-35*stringNaam.length/2)+15+35*i);
			}
		}
	}
	///listener//
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			count++;
			stringNaam[(count-1)] = "Naam: "+ inputNaam.getText();
			stringNummer[(count-1)] = "Telefoonnummer: "+ inputNummer.getText();
			inputNaam.setText("");
			inputNummer.setText("");
			inputNaam.requestFocus();
			repaint();
		}
	}
}
package H14;

import java.applet.Applet;
import java.awt.Graphics;

public class Opdracht1 extends Applet {
	private String[] kleuren = {"Ruiten", "klaver", "Harten", "Schoppen"};
	private String[] kaarten = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer", "aas"};
	private String[] deck;
	
	public void init() {
		deck = new String[52];
		int index = 0;
		for (int i = 0; i < kleuren.length; i++){
			String kleur = kleuren[i];
			
			for(int j = 0; j < kaarten.length; j++){
				String kaart = kaarten[j];
				deck[index] = kleur + " " +kaart;
				index++;
			}
			
		}
}
	public void paint(Graphics g){
		int x = 50;
		int y = 70;
		
		double r = Math.random();
		int random =(int) (r * 52);
		
		g.drawString(deck[random], x, y);
	}
}

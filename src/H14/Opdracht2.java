package H14;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Random;


public class Opdracht2 extends Applet {
	private String[] kleuren = {"Ruiten", "klaver", "Harten", "Schoppen"};
	private String[] kaarten = {"twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "tien", "boer", "vrouw", "heer", "aas"};
	private String[] deck = new String[52];
	private String[] speler1 = new String[13];
	private String[] speler2 = new String[13];
	private String[] speler3 = new String[13];
	private String[] speler4 = new String[13];
		


   public void init() {
	  setSize(800, 500);
	  int index = 0;
      for (int i = 0; i < kleuren.length; i++) {
    	  String kleur = kleuren [i];
    	  for (int j = 0; j < kaarten.length; j++) {
    		  String kaart = kaarten [j];
    		  deck[index] = kleur + " " + kaart;
    		  index++;
    	  }
      }
  
   
   for (int i = 0; i < 13; i++) {
	   speler1[i] = deelKaart();
	   speler2[i] = deelKaart();
	   speler3[i] = deelKaart();
	   speler4[i] = deelKaart();
   }
     }

   public void paint(Graphics g) {
	   int x1 = 50;
	   int x2 = 250;
	   int x3 = 450;
	   int x4 = 650;
	   int y = 70;
	   g.drawString("Speler1", x1, y);
	   g.drawString("Speler2", x2, y);
	   g.drawString("Speler3", x3, y);
	   g.drawString("Speler4", x4, y);
	   y = 100;
	   for(int i = 0; i < 13; i++) {
		   g.drawString(speler1[i], x1, y);
		   g.drawString(speler2[i], x2, y);
		   g.drawString(speler3[i], x3, y);
		   g.drawString(speler4[i], x4, y);
		   y += 20;
	   }
   }


private String deelKaart() {
int random = new Random().nextInt(deck.length);
String kaart = deck[random];
String[] hulplijst = new String[deck.length - 1];
int hulpindex = 0;
for( int i = 0; i < deck.length; i++) {
	if(i != random) {
		hulplijst[hulpindex] = deck[i];
		hulpindex++;
	}
}
deck = hulplijst;
return kaart;
}
}



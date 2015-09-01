import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

	public class Variabelen extends Applet{
	    //declaratie.
	    Color opvulkleur;
	    Color lijnkleur;
	    int breedte;
	    int hoogte;

	    public void init() {
	        //initialisatie. 
	        opvulkleur = Color.MAGENTA;
	        lijnkleur = Color.BLACK;
	        breedte = 200;
	        hoogte = 100;
	    }

	    public void paint(Graphics g) {
	        //teken rechthoek
	        g.drawRect(100, 100, breedte, hoogte);
	        //teken afgeronde rechthoek
	        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
	        //teken gevulde rechthoek
	        g.setColor(opvulkleur);
	        g.fillRect(315, 100, breedte, hoogte);
	        //teken ovaal
	        g.setColor(lijnkleur);
	        g.drawOval(315, 100, breedte, hoogte);
	        //teken gevulde ovaal
	        g.setColor(opvulkleur);
	        g.fillOval(315, 225, breedte, hoogte);
	        // en zo voort... Now watch me whip1
	        g.setColor(Color.black);
	        g.drawOval (550, 225, hoogte, 100);
	        g.setColor(Color.black);
	        g.drawArc(550, 100, 100, 100, 360, 360);
	        g.setColor(Color.MAGENTA);
	        g.fillArc(550, 100, 100, 100, 360, 45);
	        g.setColor(Color.black);
	        g.drawLine(105, 50, 305, 50);
	        g.drawString("lijn", 200, 70);
	        g.drawString("rechthoek", 180, 215);
	        g.drawString("afgeronde rechthoek", 150, 340);
	        g.drawString("gevulde ovaal", 380, 340);
	        g.drawString("gevulde rechthoek met ovaal", 340, 215);
	        g.drawString("cirkel", 585, 340);
	        g.drawString("taartpunt met ovaal eromheen", 520, 215);
	    }
	}


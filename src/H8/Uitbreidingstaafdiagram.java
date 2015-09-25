package H8;


	import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
	import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

	public class Uitbreidingstaafdiagram  extends Applet {
	      int valerie = 40;
	      int jeroen = 100;
	      int hans = 80;
	      int breedteScherm;
	      int hoogteScherm;
	      
	      int ruimteTop = 100;
	      
	      
		  int margeH;
		  int margeV;
		  int hoogteYas;
		  int maxGewicht = 140;
		  int aantalStrepen = 7;
	      int breedteStaaf;
	      
	      Label valerieLabel;
	      TextField valerieTextField;
	      Label jeroenLabel;
	      TextField jeroenTextField;
	      Label hansLabel;
	      TextField hansTextField;
	      Button invoerknop;
	      
	      
	      public void init() {
	    	  breedteScherm = 500;
	    	  hoogteScherm = 400;
	    	  hoogteScherm += ruimteTop;
	    	  this.setSize(breedteScherm, hoogteScherm);
	    	  margeH = breedteScherm / 10;
	    	  margeV = hoogteScherm / 10;
	    	  hoogteYas = hoogteScherm - ruimteTop - margeV * 2;
	    	  breedteStaaf = margeH;
	    	  valerieLabel = new Label("Valerie");
	    	  add(valerieLabel);
	    	  valerieTextField = new TextField("" + valerie, 5);
	    	  add(valerieTextField);
	    	  jeroenLabel = new Label("jeroen");
	    	  add(jeroenLabel);
	    	  jeroenTextField = new TextField("" + jeroen, 5);
	    	  add(jeroenTextField);
	    	  hansLabel = new Label("hans");
	    	  add(hansLabel);
	    	  hansTextField = new TextField("" + hans, 5);
	    	  add(hansTextField);
	    	  invoerknop = new Button("Wijzig waardes");
	    	  add(invoerknop);
	    	  invoerknop.addActionListener(new KnopLuisteraar());
	    	  
	    	 
	      }
	    	public void paint(Graphics g) {
	    		breedteScherm = this.getWidth();
	    		hoogteScherm = this.getHeight();
	    		margeH = breedteScherm / 10;
	      	    margeV = hoogteScherm / 10;
	      	    hoogteYas = hoogteScherm - ruimteTop - margeV * 2;
	    		int x = margeH;
	    		int y = hoogteScherm - margeV;
	    		int x2 = breedteScherm - margeH;
	    		int y2 = y;
	    		g.drawLine(x,  y, x2, y2);
	    		
	    		y2 = margeV + ruimteTop;
	    		x2 = x;
	    		g.drawLine(x, y, x2, y2);
	    		
	    		int breedteStreep = 5;
	    		x -=breedteStreep;
	    		g.drawLine(x, y, x + breedteStreep, y);
	    		y -= hoogteYas / aantalStrepen;
	    		g.drawLine(x, y, x + breedteStreep, y);
	    		y -= hoogteYas / aantalStrepen;
	    		g.drawLine(x, y, x + breedteStreep, y);
	    		y -= hoogteYas / aantalStrepen;
	    		g.drawLine(x, y, x + breedteStreep, y);
	    		y -= hoogteYas / aantalStrepen;
	    		g.drawLine(x, y, x + breedteStreep, y);
	    		y -= hoogteYas / aantalStrepen;
	    		g.drawLine(x, y, x + breedteStreep, y);
	    		y -= hoogteYas / aantalStrepen;
	    		g.drawLine(x, y, x + breedteStreep, y);
	    		
	    		x = margeH * 2;
	    		y = hoogteScherm - margeV;
	    		y -= (hoogteYas / maxGewicht) * valerie;
	    		int height = (hoogteYas / maxGewicht) * valerie;
	    		g.fillRect(x, y, breedteStaaf, height);
	    		
	    		
	    		x += margeH + breedteStaaf;
	    		y = hoogteScherm - margeV;
	    		y -= (hoogteYas / maxGewicht) * jeroen;
	    		height = (hoogteYas / maxGewicht) * jeroen;
	    		g.fillRect(x, y, breedteStaaf, height);
	    		
	    		
	    		x += margeH + breedteStaaf;
	    		y = hoogteScherm - margeV;
	    		y -= (hoogteYas / maxGewicht) * hans;
	    		height = (hoogteYas / maxGewicht) * hans;
	    		g.fillRect(x, y, breedteStaaf, height);
	    		
	    		
	    				
	    		
	    	}
	    	
	    	
	    	class KnopLuisteraar implements ActionListener {

				@Override
				public void actionPerformed(ActionEvent e) {
					String s = valerieTextField.getText();
					int i = Integer. parseInt(s);
					valerie = i;
					jeroen = Integer. parseInt(jeroenTextField.getText());
					hans = Integer. parseInt(hansTextField.getText());
					repaint();
				}

				
					
				}
	    		
	    		
	    		
	    	}
	    

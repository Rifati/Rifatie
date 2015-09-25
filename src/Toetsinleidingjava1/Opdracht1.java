package Toetsinleidingjava1;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





public class Opdracht1 extends Applet {
	Button FrisButton;
	Button BierButton;
	Button WijnButton;
	Button KoffieButton;
	Button BinnGedistButton;
	Button BuitGedistButton;
	Button NieuwebestellingButton;
	double FrisPrijs;
	double BierPrijs;
	double WijnPrijs;
	double KoffiePrijs;
	double BinnGedistPrijs;
	double BuiteGedistPrijs;
	double dagomzet;
	double totaal;
	double Bestelling;
	double gemiddelde;
	public void init() {
	setSize(500, 400);
		
          
	 
	    FrisButton = new Button("Fris");
		FrisKnopLuisteraar Fkl = new FrisKnopLuisteraar();
		FrisButton.addActionListener(Fkl);
		add(FrisButton);
		
		BierButton= new Button ("Bier");
		BierKnopLuisteraar Bkl = new BierKnopLuisteraar();
		BierButton.addActionListener(Bkl);
		add(BierButton);
		
		WijnButton = new Button ("Wijn");
		WijnKnopLuisteraar Wlkl = new WijnKnopLuisteraar();
		WijnButton.addActionListener(Wlkl);
		add(WijnButton);
		
		KoffieButton = new Button ("Koffie");
		KoffieKnopLuisteraar Kkl = new KoffieKnopLuisteraar();
		KoffieButton.addActionListener(Kkl);
		add(KoffieButton);
		
		BinnGedistButton = new Button ("BinnGedist");
		BinnGedistKnopLuisteraar binkl = new BinnGedistKnopLuisteraar();
		BinnGedistButton.addActionListener(binkl);
		add(BinnGedistButton);
		
		BuitGedistButton = new Button ("BuitGedist");
		BuitGedistKnopLuisteraar Buitkl = new BuitGedistKnopLuisteraar();
		BuitGedistButton .addActionListener(Buitkl);
		add(BuitGedistButton);
		
		NieuwebestellingButton = new Button ("Nieuwebestelling");
		NieuwebestellingKnopLuisteraar Bestelingkl = new NieuwebestellingKnopLuisteraar();
		NieuwebestellingButton.addActionListener(Bestelingkl);
		add(NieuwebestellingButton);
		
		FrisPrijs = 2.00;
		BierPrijs = 2.25;
		WijnPrijs = 2.50;
		KoffiePrijs = 1.75;
		BinnGedistPrijs = 2.75;
		BuiteGedistPrijs = 3.50;
		gemiddelde = 
	    dagomzet = 0;
	    Bestelling = 0;
	    
	    
	}
	
	public void paint(Graphics g) {
		int x = 50;
		int y = 70;
		g.drawString("Bestelling totaal: " + Bestelling, x, y);
		y = y + 20;
		g.drawString("Totaal dagomzet: " + dagomzet, x, y);
		y = y + 20;
		g.drawString("Totaal Gemiddelde bestelling : " + gemiddelde, x, y);
		y = y + 20;
		
	}
		
		
	class FrisKnopLuisteraar implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dagomzet = FrisPrijs + dagomzet;
			Bestelling = FrisPrijs + Bestelling;
			repaint();
			
		}
		}
		
		class BierKnopLuisteraar implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				dagomzet = BierPrijs + dagomzet;
				Bestelling = BierPrijs + Bestelling;
				repaint();
				
			}		
	}
		
			class WijnKnopLuisteraar implements ActionListener {
				public void actionPerformed(ActionEvent e) {
					dagomzet = WijnPrijs + dagomzet;
					Bestelling = WijnPrijs + Bestelling;
				repaint();
				}	
			}
				
				class KoffieKnopLuisteraar implements ActionListener {
					public void actionPerformed(ActionEvent e) {
						dagomzet = KoffiePrijs + dagomzet;
						Bestelling = KoffiePrijs + Bestelling;
						repaint();	
						
					}
					    }	
						
						
						
						class BinnGedistKnopLuisteraar implements ActionListener {
							public void actionPerformed(ActionEvent e) {
								dagomzet = BinnGedistPrijs + dagomzet;
								Bestelling = BinnGedistPrijs + Bestelling;
								repaint();	
							

				
}
    }
						class BuitGedistKnopLuisteraar implements ActionListener {
							public void actionPerformed(ActionEvent e) {
								dagomzet = BuiteGedistPrijs + dagomzet;
								Bestelling = BuiteGedistPrijs + Bestelling;
								repaint();	
	
					}
						}



         class NieuwebestellingKnopLuisteraar implements ActionListener {
	             public void actionPerformed(ActionEvent e) {
	            	 Bestelling = 0; 
		            repaint();	
		            
		            
	             }
         }
         }
 
	        
						

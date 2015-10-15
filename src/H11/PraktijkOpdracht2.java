package H11;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class PraktijkOpdracht2 extends Applet
{
	int tafelinput;
	int i, x, y;
	Button vak1;
	
	public void init()
	{
		setSize(300,300);
		tafelinput = 0;
		vak1 = new Button("next");
		vak1.setSize(300, 500);
		Listen1 l1 = new Listen1();
		vak1.addActionListener(l1);
		add (vak1);
		
	}
	public void paint(Graphics g)
	{
		 x = 60;
		 y = 60;
	 if (tafelinput>0)
	{
		for(i = 0; i<10;)
		{
			y = y+20;
			i++;
			g.drawString(i+"x"+tafelinput+"="+tafelinput*i, x, y);
		}
	 }
	 vak1.setSize(150, 20);
	}
	class Listen1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			tafelinput++;
			repaint();
		}
	}
}	
package lab3;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Line2D;

import javax.swing.JApplet;

public class SpringApplet extends JApplet {

	public static final int WIDTH=640; // definiuje szerokosc oraz wysokosc appletu, które ustawiam w konfiguracjach RUN,
	public static final int HEIGHT=480; // zmiennych tych bede uzywac przy rysowaniu wektorów
	
	public SpringApplet()
	{
		
			
		
	}
	
	private static final long serialVersionUID = 1L;
	

	
	public void init()
	{
		Vector2D wektorek1 = new Vector2D(0,0,3,2);
		Vector2D wektorek2 = new Vector2D(0,0,2,2);
		Vector2D wektorek3 = new Vector2D(1,1,3,5);
		Vector2D wektorek4 = new Vector2D(1,1,3,7);
		Vector2D wektorek5 = new Vector2D();
		Vector2D wektorek6 = new Vector2D();
		Vector2D wektorek7 = new Vector2D();
	
		
		wektorek5 = wektorek1.addVector(wektorek2);
		wektorek5.wyswietl();
		wektorek6 = wektorek2.minusVector(wektorek3);
		wektorek6.wyswietl();
		wektorek7 = wektorek4.multiplyVecotr(20);
		wektorek7.wyswietl();	
		
		Vector2D wektorek8 = wektorek2.normalizacjaWektora(wektorek2);
		wektorek8.wyswietl();
		
	}
	
	// kod do zadania dodatkowego
	// rozmiary okna appletu ustawiam w opcjach kompilacj
	public void paint(Graphics g)
	{
		super.paint(g);
	
		Graphics2D g2d = (Graphics2D)g;
		
		Vector2D vektor1 = new Vector2D(0,0,20,30);
		Vector2D vektor2 = new Vector2D(0,0,15,20);
		Vector2D vektor3 = vektor1.addVector(vektor2);
		Vector2D vektor4 = vektor1.minusVector(vektor2);
		Vector2D vektor5 = vektor1.multiplyVecotr(5);
		
		// zamiana wektorow na mpx(nie konieczne lecz lepiej widoczne)
		
		Vector2D vektor7 = vektor1.changeWektor(vektor1);
		Vector2D vektor8 = vektor3.changeWektor(vektor3);
		
		Vector2D vektor9 = vektor2.changeWektor(vektor2);
		
		Vector2D vektor10 = vektor4.changeWektor(vektor4);
		
		Vector2D vektor11 = vektor5.changeWektor(vektor5);
		
		
		
		//tworzenie obiektow klasy Line2D oraz Grotow z wspolrzednymi vektorow podanych
		
		
		Line2D linia1 = new Line2D.Double(vektor7.x1, vektor7.y1, vektor7.x2, vektor7.y2);
		Polygon grot1 = new Polygon(vektor7.getPolygonX(),vektor7.getPolygonY(),5);
		
		Line2D linia2 = new Line2D.Double(vektor8.x1, vektor8.y1, vektor8.x2, vektor8.y2);
		Polygon grot2 = new Polygon(vektor8.getPolygonX(),vektor8.getPolygonY(),5);
		
		Line2D linia3 = new Line2D.Double(vektor9.x1, vektor9.y1, vektor9.x2, vektor9.y2);
		Polygon grot3 = new Polygon(vektor9.getPolygonX(),vektor9.getPolygonY(),5);
		
		Line2D linia4 = new Line2D.Double(vektor10.x1, vektor10.y1,vektor10.x2, vektor10.y2);
		Polygon grot4 = new Polygon(vektor10.getPolygonX(),vektor10.getPolygonY(),5);
		
		Line2D linia5 = new Line2D.Double(vektor11.x1, vektor11.y1,vektor11.x2, vektor11.y2);
		Polygon grot5 = new Polygon(vektor11.getPolygonX(),vektor11.getPolygonY(),5);
		
	
	
		//rysowanie układu współrzędnych
		g2d.setColor(Color.BLACK);
		g2d.drawLine(10, 0, 10, HEIGHT-10);
		g2d.drawLine(10, HEIGHT-10, WIDTH, HEIGHT-10);
		g2d.setFont(new Font("SansSerif",Font.BOLD,10));
		g2d.drawString("Os y", 12, 12);
		g2d.drawString("Os x", WIDTH-30, HEIGHT-12);
		
		
		
		
		//Rysowanie wektora 1 do dodania 
		
		g2d.setColor(Color.red);
		g2d.draw(linia1);
		g2d.fillPolygon(grot1);
		g2d.drawString("Wektor 1" , vektor7.getXString(), vektor7.getYString());
		
		//rysowanie wektora wynikowego po dodanie dwoch
		g2d.setColor(Color.GREEN);
		g2d.draw(linia2);
		g2d.fillPolygon(grot2);
		g2d.drawString("Wektor 1+2" , vektor8.getXString(), vektor8.getYString());
		
		// rysowanie wektora 2giego do dodania
		
		g2d.setColor(Color.BLUE);
		g2d.draw(linia3);
		g2d.fillPolygon(grot3);
		g2d.drawString("Wektor 2" , vektor9.getXString(), vektor9.getYString());
		
		// rysowanie wektora wynikowego po odjeciu dwoch
		
		g2d.setColor(Color.BLUE);
		g2d.draw(linia4);
		g2d.fillPolygon(grot4);
		g2d.drawString("Wektor 1-2" , vektor10.getXString(), vektor10.getYString());
		
		// rysowanie wektora wynikowego po przemnozeniu przez stała
		
		g2d.setColor(Color.GREEN);
		g2d.draw(linia5);
		g2d.fillPolygon(grot5);
		g2d.drawString("Wektor 1 * const" , vektor11.getXString(), vektor11.getYString());
		
		
		
	
	}
}


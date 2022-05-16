package m.vectors;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 * Clase que implementa el contenido (cuadrícula) del plano cartesiano.
 * Toma en cuenta las dimensiones del objeto Ventana y las divide para imprimir
 * de manera sistemática las rectas horizontales y verticales que corresponderán al
 * gradiente del plano.
 * @author Cinthya G, Iker J, Valeria R
 *
 */
public class Plano {
	
	private double ancho;
	private double alto;
	
	/**
	 * Construye un objeto de dicho tipo acorde al ancho y alto de la ventana.
	 * @param ancho Ancho de ventana (pix)
	 * @param alto Alto de ventana (pix)
	 */
	public Plano(double ancho, double alto){
		this.ancho = ancho;
		this.alto = alto;
		
	}
	
	/**
	 * Dibuja una secuencia de rectas verticales y horizontales para representar
	 * la cuadrícula del plano.
	 * @param g Objeto Graphics a manipular.
	 */
	public void dibujar(Graphics2D g){
		
		// Lineas verticales
		for(int i = 0; i < alto; i++){
			Line2D  linea = new Line2D.Double(i,0,i,ancho);
			if(i % 10 == 0){
				g.setColor(new Color(204,204,204));
				g.draw(linea);
			}
		}
		
		// Lineas horizontales
		for(int i = 0; i < ancho; i++){
			Line2D  linea = new Line2D.Double(0,i,alto,i);
			if(i % 10 == 0){
				g.setColor(new Color(204,204,204));
				g.draw(linea);
			}
		}
		
		// Ejes
		g.setColor(Color.BLACK);
		Line2D linea_y = new Line2D.Double(alto/2,0,alto/2,ancho);
		Line2D  linea_x = new Line2D.Double(0,ancho/2,alto,ancho/2);
		g.draw(linea_x);
		g.draw(linea_y);
		
	}
	
	
	
	
	
}
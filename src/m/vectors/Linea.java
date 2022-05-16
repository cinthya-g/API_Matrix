package m.vectors;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

/**
 * Clase que crea objetos del tipo Linea conformadas por Puntos.
 * Linea es una clase que se basa en construir un objeto del tipo, agregando
 * dos del tipo punto para formar el inicio y el fin de una recta para su posterior
 * graficación.
 * @author Cinthya G, Iker J, Valeria R
 *
 */
public class Linea {
	
	private Punto punto1;
	private Punto punto2;
	
	/**
	 * Construye el objeto de dicho tipo.
	 */
	public Linea(){
		
	}

	/**
	 * Construye el objeto de dicho tipo indicando los puntos de inicio y fin
	 * con objetos de tipo Punto.
	 * @param punto1 Inicio
	 * @param punto2 Fin
	 */
	public Linea(Punto punto1, Punto punto2){
		this.punto1 = punto1;
		this.punto2 = punto2;
		
	}
	
	/**
	 * Construye el objeto de dicho tipo indicando los puntos de inicio y fin con
	 * valores reales.
	 * @param x1 Coordenada x del punto de inicio
	 * @param y1 Coordenada y del punto de inicio
	 * @param x2 Coordenada x del punto final
	 * @param y2 Coordenada y del punto final
	 * @param texto <b>true</b> si se quiere que se imprima la coordenada en texto,
	 * <b>false</b> en caso contrario.
	 */
	public Linea(double x1, double y1, double x2, double y2,boolean texto){
		if(texto){
			this.punto1 = new Punto(x1, y1,true);
			this.punto2 = new Punto(x2, y2,true);
		}else{
			this.punto1 = new Punto(x1, y1,false);
			this.punto2 = new Punto(x2, y2,false);
		}
	}
	
	/**
	 * Construye el objeto de dicho tipo indicando los puntos de inicio y fin con
	 * valores reales; por defecto, omite las etiquetas de texto para representar
	 *  las coordenadas de los puntos inicial y final.
	 * @param x1 Coordenada x del punto de inicio
	 * @param y1 Coordenada y del punto de inicio
	 * @param x2 Coordenada x del punto final
	 * @param y2 Coordenada y del punto final
	 */
	public Linea(double x1, double y1, double x2, double y2){
		
			this.punto1 = new Punto(x1, y1,false);
			this.punto2 = new Punto(x2, y2,false);
	}
	
	/**
	 * Dibujar la línea enviada con un texto predeterminado, iniciando y terminando
	 * en sus puntos adjuntos.
	 * @param g Objeto Graphics a manipular
	 * @param c Color de dibujado de la recta
	 */
	public void dibujar(Graphics2D g, Color c){
		g.setColor(c);
		g.setFont(new Font( "SansSerif", Font.PLAIN, 10 ));
		g.drawString(punto1.toString(), (int)punto1.get_x()+2,(int) punto1.get_y() -2);
		g.drawString(punto2.toString(), (int)punto2.get_x()+2,(int) punto2.get_y() -2);
		g.setColor(c);
		Line2D linea = new Line2D.Double(punto1.get_x(),punto1.get_y(),punto2.get_x(),punto2.get_y());
		g.draw(linea);
	}

}

package m.vectors;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

/**
 * Clase que crea el espacio dentro de la ventana en donde se representará
 * el plano cartesiano. Dentro de su dibujado, también se incluirán los vectores
 * a graficar que envíe el usuario. Sólo consta de líneas para simular la cuadrícula
 * del plano de dos dimensiones (eje de las abscisas y eje de las ordenadas).
 * @author Cinthya G, Iker J, Valeria R
 *
 */
public class PanelDibujo extends JPanel {
	
	private Color operands = new Color(49, 28, 223); // azul oscuro
	private Color result = new Color(12, 161, 64); //verde	
	private Color parallelogram = new Color(179, 24, 246); // morado
	
	/**
	 * Construye el objeto de dicho tipo.
	 */
	public PanelDibujo(){
		
	}
	
	/**
	 * Muestra el plano cartesiano dibujado y las líneas (vectores) del usurio.
	 * Asocia, también, el atributo de arrayOfVectors de Vector para imprimir
	 * una de las cuatro operaciones disponibles en aquella clase.
	 * @param g Objeto Graphics a manipular
	 */
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		
		Plano plano = new Plano(Ventana.ANCHO,Ventana.ALTO);
		plano.dibujar(g2);
		
		Vector[] v = Vector.getArrayOfVectors();
		
		//aquí se dibujan las líneas graficadas
		
		for(int i = 0; i < v.length; i++) {
			
			// PARALLELOGRAM
			if(v.length > 3 && i >= 2) {
				Linea linea = new Linea(0,0,v[i].getComponent(0),v[i].getComponent(1), true);		
				if(i<2) linea.dibujar(g2, operands);
				else {
					linea = new Linea(v[i-1].getComponent(0), v[i-1].getComponent(1), v[i].getComponent(0), v[i].getComponent(1), true);
					linea.dibujar(g2, parallelogram);
				}
				
			}
			// ESCALAR M
			else if(v.length <= 2) {
				Linea linea = new Linea(0,0,v[0].getComponent(0), v[0].getComponent(1), true);
				linea.dibujar(g2, operands);
				
				int x = -100;
				if(v[0].getComponent(0) > 0) x*=-1;
				Linea esc = new Linea(x,0,v[1].getComponent(0)+x, v[1].getComponent(1), true);
				esc.dibujar(g2,  parallelogram);
				
			}
			// SUM OR SUB
			else {
				Linea linea = new Linea(0,0,v[i].getComponent(0),v[i].getComponent(1), true);		
				if(i<2) linea.dibujar(g2, operands);
				else linea.dibujar(g2, result);
			}
		}
		

	}

	
	
}

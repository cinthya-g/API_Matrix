package m.vectors;

import javax.swing.JFrame;

/**
 * Clase que implementa la aparici�n y caracter�sticas de una ventana nueva.
 * <p>
 * La ventana generada deber� tener dimensiones cuadradas medidas en pixeles.
 * La resoluci�n de su contenido depender� completamente del tama�o
 * y resoluci�n de quien genera el objeto.
 * </p>
 * @author Cinthya G, Iker J, Valeria R
 *
 */
public class Ventana extends JFrame{
	
	public static final int ANCHO = 800;
	public static final int ALTO = 800;
	private PanelDibujo pd;
	
	/**
	 * Construye un objeto de dicho tipo.
	 */
	public Ventana(){
		this.configuracionVentana();
		PanelDibujo pd = new PanelDibujo();
		super.add(pd);
	}
	
	/**
	 * Establece las caracter�sticas intr�nsecas de la ventana a generar.
	 */
	public void configuracionVentana(){
		super.setTitle("Plano cartesiano - Operaciones vectoriales");
		super.setBounds(200,20, Ventana.ANCHO, Ventana.ALTO);
		super.setVisible(true);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		super.setResizable(false);
	}
	
	
}
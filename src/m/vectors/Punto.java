package m.vectors;

/**
 * Clase que implementa el origen y el fin de dibujo de un objeto de tipo Linea.
 * Los puntos son objetos que contienen dos elementos principales: coordenada x y coordenada y.
 * Sus variaciones represnetan la posición que el objeto Linea tomará en el plano dibujado.
 * @author Cinthya G, Iker J, Valeria R
 *
 */
public class Punto {
	private double x; //_x
	private double y; //_y
	private double v_x;
	private double v_y;
	private boolean texto;
	
	/**
	 * Construye un objeto de dicho tipo.
	 */
	public Punto(){
		
	}
	
	/**
	 * Contruye un objeto de dicho tipo especificando los valores de la coordenada
	 * (x, y).
	 * @param x Coordenada en x
	 * @param y Coordenada en y
	 * @param texto <b>true</b> si se quiere una etiqueta textual con la coordenada,
	 * <b>false</b> en caso contrario.
	 */
	public Punto(double x, double y, boolean texto) {
		super();
		this.v_x = x;
		this.v_y = y;
		this.x = ((double)Ventana.ALTO/2) + x;
		this.y = ((double) Ventana.ANCHO/2) + ((-1)* (y));
		this.texto = texto;
	}

	/**
	 * Retorna la coordenada x del punto.
	 * @return Valor real (x)
	 */
	public double get_x() {
		return x;
	}
	
	/**
	 * Establece la coordenada x del punto.
	 * @param x Valor de x
	 */
	public void set_x(double x) {
		this.x = x;
	}
	
	/**
	 * Retorna la coordenada y del punto.
	 * @return Valor real (y)
	 */
	public double get_y() {
		return y;
	}
	
	/**
	 * Establece la coordenada y del punto.
	 * @param y Valor de y
	 */
	public void set_y(double y) {
		this.y = y;
	}
	
	/**
	 * Sobreescribe la representación en formato de cadena de la coordenada respectiva.
	 */
	@Override
	public String toString(){
		if(this.texto){
			return "("+this.v_x+","+this.v_y+")";
		}else{
			return "";
		}
		
	}
	
}
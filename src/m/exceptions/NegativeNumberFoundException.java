package m.exceptions;

/**
 * N�mero no real o cero encontrado en la creaci�n de un objeto Matrix.
 * <p>
 * Esta excepci�n indica que un n�mero negativo no puede ser 
 * recibido/ejecutado.
 * La excepci�n ser�a lanzada si se crea una matriz con un valor de fila/columna <b>negativo</b>.
 * </p>
 * @author Cinthya G, Iker J, Valeria R
 *
 */

public class NegativeNumberFoundException extends Exception {
	
	private double negativeNumber;
	
	/**
	 * Construye una excepci�n de dicho tipo.
	 * @param negativeNumber Valor quec caus� la excepci�n.
	 */
	public NegativeNumberFoundException(double negativeNumber) {
		super("NegativeNumberFoundException");  
		this.negativeNumber=negativeNumber;
		
	}
	
	/**
	 * Detalle del mensaje que arroja la excepci�n.
	 */
	@Override
	public String toString() {
		return String.format("%s\nNegative number found: %f\n Matrix can't be created with a negative number. ",getMessage(), negativeNumber );
	}
}

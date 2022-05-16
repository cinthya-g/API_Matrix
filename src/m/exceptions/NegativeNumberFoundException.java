package m.exceptions;

/**
 * Número no real o cero encontrado en la creación de un objeto Matrix.
 * <p>
 * Esta excepción indica que un número negativo no puede ser 
 * recibido/ejecutado.
 * La excepción sería lanzada si se crea una matriz con un valor de fila/columna <b>negativo</b>.
 * </p>
 * @author Cinthya G, Iker J, Valeria R
 *
 */

public class NegativeNumberFoundException extends Exception {
	
	private double negativeNumber;
	
	/**
	 * Construye una excepción de dicho tipo.
	 * @param negativeNumber Valor quec causó la excepción.
	 */
	public NegativeNumberFoundException(double negativeNumber) {
		super("NegativeNumberFoundException");  
		this.negativeNumber=negativeNumber;
		
	}
	
	/**
	 * Detalle del mensaje que arroja la excepción.
	 */
	@Override
	public String toString() {
		return String.format("%s\nNegative number found: %f\n Matrix can't be created with a negative number. ",getMessage(), negativeNumber );
	}
}

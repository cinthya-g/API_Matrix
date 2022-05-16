package m.exceptions;

/**
 * Operación vectorial no ejecutada con éxito.
 * <p>
 * Esta excepción puede aparecer cuando se solicita realizar una operación
 * entre vectores y sus dimensiones <b>no son las mismas</b>, por lo tanto, no se puede realizar.
 * </p>
 * @author Cinthya G, Iker J, Valeria R
 *
 */

public class IllegalVectorOperationException extends Exception {
	
	/**
	 * Construye una excepción de dicho tipo.
	 */
	public IllegalVectorOperationException() {
		super("IllegalVectorOperationException");  
	}
	
	/**
	 * Detalle del mensaje que arroja la excepción.
	 */
	@Override
	public String toString() {
		return String.format("%s\nVectorial operation can't be performed, they have different sizes",getMessage());
	}
}

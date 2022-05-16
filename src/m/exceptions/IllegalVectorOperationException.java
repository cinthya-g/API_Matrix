package m.exceptions;

/**
 * Operaci�n vectorial no ejecutada con �xito.
 * <p>
 * Esta excepci�n puede aparecer cuando se solicita realizar una operaci�n
 * entre vectores y sus dimensiones <b>no son las mismas</b>, por lo tanto, no se puede realizar.
 * </p>
 * @author Cinthya G, Iker J, Valeria R
 *
 */

public class IllegalVectorOperationException extends Exception {
	
	/**
	 * Construye una excepci�n de dicho tipo.
	 */
	public IllegalVectorOperationException() {
		super("IllegalVectorOperationException");  
	}
	
	/**
	 * Detalle del mensaje que arroja la excepci�n.
	 */
	@Override
	public String toString() {
		return String.format("%s\nVectorial operation can't be performed, they have different sizes",getMessage());
	}
}

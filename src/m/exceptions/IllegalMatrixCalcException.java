
package m.exceptions;

/**
 * 
 * Operaci�n matricial no ejecutada con �xito.
 * <p>
 * Esta excepci�n indica que una operaci�n no puede
 * ser calculada espec�ficamente porque los �ndices de una matriz <b>no son suficientes</b>
 * o <b>no coinciden</b> con la otra matriz a operar.
 * </p>
 * 
 * @author Cinthya G, Iker J, Valeria R
 *
 */

public class IllegalMatrixCalcException extends Exception {

	/**
	 * Construye una excepci�n del tipo.
	 */
	public IllegalMatrixCalcException() {
		super("IllegalMatrixCalcException");  
	}
	
	
	/**
	 * Detalle del mensaje que arroja la excepci�n.
	 */
	@Override
	public String toString() {
		return String.format("%s\nMatrixCalc can't be performed, they have different sizes",getMessage());
	}
}

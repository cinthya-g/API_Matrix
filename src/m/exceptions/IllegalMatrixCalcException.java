
package m.exceptions;

/**
 * 
 * Operación matricial no ejecutada con éxito.
 * <p>
 * Esta excepción indica que una operación no puede
 * ser calculada específicamente porque los índices de una matriz <b>no son suficientes</b>
 * o <b>no coinciden</b> con la otra matriz a operar.
 * </p>
 * 
 * @author Cinthya G, Iker J, Valeria R
 *
 */

public class IllegalMatrixCalcException extends Exception {

	/**
	 * Construye una excepción del tipo.
	 */
	public IllegalMatrixCalcException() {
		super("IllegalMatrixCalcException");  
	}
	
	
	/**
	 * Detalle del mensaje que arroja la excepción.
	 */
	@Override
	public String toString() {
		return String.format("%s\nMatrixCalc can't be performed, they have different sizes",getMessage());
	}
}

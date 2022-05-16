package m.exceptions;

/**
 * Componentes insuficientes en la creaci�n o recepci�n de un objeto Vector.
 * <p>
 * Esta excepci�n puede aparecer cuando se necesita crear un Vector pero la cantidad de 
 * elementos proporcionada <b>no es la suficiente</b> para ejecutarlo.
 * </p>
 * 
 * @author Cintya G, Iker J, Valeria R
 *
 */

public class InsufficientComponentsException extends Exception {
	private int componentsNumber;
	
	/**
	 * Construye una excepci�n de dicho tipo.
	 * @param componentsNumber Valor que caus� la excepci�n.
	 */
	public InsufficientComponentsException(int componentsNumber) {
		super("InsufficientComponentsException");
		this.componentsNumber = componentsNumber;
	}
	
	/**
	 * Detalle del mensaje que arroja la excepci�n.
	 */
	@Override
	public String toString() {
		return String.format("%s\nNot enough components to create vector."
				+ "			\nVector can't be created with %d components.", getMessage(), componentsNumber);
	}
}

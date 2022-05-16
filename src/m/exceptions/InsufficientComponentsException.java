package m.exceptions;

/**
 * Componentes insuficientes en la creación o recepción de un objeto Vector.
 * <p>
 * Esta excepción puede aparecer cuando se necesita crear un Vector pero la cantidad de 
 * elementos proporcionada <b>no es la suficiente</b> para ejecutarlo.
 * </p>
 * 
 * @author Cintya G, Iker J, Valeria R
 *
 */

public class InsufficientComponentsException extends Exception {
	private int componentsNumber;
	
	/**
	 * Construye una excepción de dicho tipo.
	 * @param componentsNumber Valor que causó la excepción.
	 */
	public InsufficientComponentsException(int componentsNumber) {
		super("InsufficientComponentsException");
		this.componentsNumber = componentsNumber;
	}
	
	/**
	 * Detalle del mensaje que arroja la excepción.
	 */
	@Override
	public String toString() {
		return String.format("%s\nNot enough components to create vector."
				+ "			\nVector can't be created with %d components.", getMessage(), componentsNumber);
	}
}

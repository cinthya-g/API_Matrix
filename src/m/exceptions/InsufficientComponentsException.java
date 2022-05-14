package m.exceptions;

public class InsufficientComponentsException extends Exception {
	private int componentsNumber;
	
	public InsufficientComponentsException(int componentsNumber) {
		super("InsufficientComponentsException");
		this.componentsNumber = componentsNumber;
	}
	
	public String toString() {
		return String.format("%s\nNot enough components to create vector."
				+ "			\nVector can't be created with %d components.", getMessage(), componentsNumber);
	}
}

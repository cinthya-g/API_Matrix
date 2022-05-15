package m.exceptions;

public class IllegalVectorOperationException extends Exception {
	
	public IllegalVectorOperationException() {
		super("IllegalVectorOperationException");  
	}
	
	
	@Override
	public String toString() {
		return String.format("%s\nVectorial operation can't be performed, they have different sizes",getMessage());
	}
}

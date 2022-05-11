package m.exceptions;

public class IllegalSetNumberFoundException extends Exception{
	private int illegalNumber;
	public IllegalSetNumberFoundException(int illegalNumber) {
		super("IllegalSetNumberFoundExceptio");  
		this.illegalNumber=illegalNumber;
		
	}
	
	
	public String toString() {
		return String.format("%s\nIllegal set number found: %f\n. ",getMessage(), illegalNumber );
	}

}

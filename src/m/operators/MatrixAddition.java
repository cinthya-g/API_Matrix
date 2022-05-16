package m.operators;

import m.exceptions.*;
import m.matrices.*;

/**Adici�n de matrices (suma).
 * MatrixAddition extiende a la clase abstracta BinaryOperation
 * (Operaci�n lineal, se calcula sumando los elementos que ocupan la misma posici�n)
 * @author Cinthya G, Iker J, Valeria R
 *
 */
public class MatrixAddition extends BinaryOperator {
	
	/**
	 * Construye el objeto de dicho tipo.
	 */
	public MatrixAddition() {
		
	}

	
	@Override
	public Matrix calc(Matrix m1, Matrix m2) throws NegativeNumberFoundException,IllegalMatrixCalcException {
		if(m1.getIsSquare()!=m2.getIsSquare())
			throw new IllegalMatrixCalcException();
		
		if(m1.getArrayM().length<0)
			throw new NegativeNumberFoundException(m1.getArrayM().length);
		Matrix result = new Matrix(m1.getRow());
		
		
		for(int i=0; i<m1.getRow();i++) {
			for(int j=0; j<m1.getColumn();j++) {
				result.setValue(i, j, (m1.getValue(i, j))+(m2.getValue(i, j)));
				
			}
		}
		return result;
	}

}
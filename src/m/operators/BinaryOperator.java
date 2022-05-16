package m.operators;

import m.exceptions.*;
import m.matrices.*;
/** 
 * Clase que almacena el prototipo de m�todo para utilizar en operaciones binarias.
 * <p>
 * Clase abstracta BinaryOperator, de la cual dependen todas aquellas
 * operaciones en la que se encuentran involcuradas 2 matrices.
 * </p>
 * @author Cinthya G, Iker J, Valeria R
 * 
 */
public abstract class BinaryOperator extends Matrix {
	
	
	/**
	 * Construye el objeto de dicho tipo.
	 */
	public BinaryOperator() {
		
	}
	
	/**
	 * Este m�todo es invocado para crear un objeto cuando se desea ejecutar un c�lculo entre 2 matrices
	 * (MatrixAdditon, MatrixSubstraction, MatrixMultiplication)
	 * @param m1 (Matrix 1)
	 * @param m2 (Matrix 2)
	 * @return  Una nueva matriz resultante
	 * @throws NegativeNumberFoundException  (La creaci�n de una nueva matriz fue con un n�mero negativo)
	 * @throws IllegalMatrixCalcException  (El c�lculo entre operaciones no es posible debido a las caracter�sticas propias de 
	 * cada c�lculo)
	 */
	public abstract Matrix calc(Matrix m1, Matrix m2) throws NegativeNumberFoundException, IllegalMatrixCalcException;

}

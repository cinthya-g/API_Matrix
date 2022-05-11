package m.operators;

import m.matrices.Matrix;

public class MatrixTranspose extends UnaryOperator{
	public MatrixTranspose() {
	}
	@Override
	public Matrix calc(Matrix m) {
		
		Matrix temp = new Matrix(m.getRow(), m.getColumn());
	
		for(int i=0;i<m.getRow();i++)    
			for(int j=0;j<m.getColumn();j++)    
				temp.setValue(i, j, m.getValue(j, i));
		return temp;
		
	}
}

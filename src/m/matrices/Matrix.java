package m.matrices;

import m.files.*;

public class Matrix{

	private int row;
	private int column;
	protected double[][] arrayM;
	private boolean isSquare;

	public Matrix(){
	}
	// Hacer excepción para no pasar tamaños menores a 1 e implementarlo en los constructores
	public Matrix(int row) {
		isSquare = true;
		this.arrayM = new double [row][row];
		this.row = row;
		this.column = row;
		addZeros();
	}
	
	// Posible constructor con enums, idk
//	public Matrix(int row, MType enum) {
//		
//	}
	
	
	public Matrix(int row, int column) {
		this.arrayM = new double [row][column];
		if(row == column) isSquare = true;
		this.row = row;
		this.column = column;
		addZeros();
		
	}

	// Excepción por si rebasa los bounds de la matriz
	public void setValue(int row, int column,double value) {
		this.arrayM[row][column]= value;
		
	}

	// Excepción por si rebasa los bounds de la matriz
	public double getValue(int row, int column) {
		return arrayM[row][column];
	}


	public boolean isSimmetric() {
		if(!isSquare)
			return false;
        else
	    	for (int i = 0; i < row; i++)
	            for (int j = 0; j < column; j++)
	                if(arrayM[i][j] != arrayM[j][i])
	                    return false;     
		return true;
	}


	public boolean isIdentity() {
		 if(!isSquare)    
	            return false;  
	        else
	            for(int i = 0; i < row; i++)   
	                for(int j = 0; j < column; j++) {    
	                  if(i == j && arrayM[i][j] != 1)   
	                      return false;    
	                  if(i != j && arrayM[i][j] != 0)   
	                      return false;  
	                }
		 return true;         
	}


	public boolean isTriangularSup() {
		if(!isSquare) 
            return false;
        else {  
	        for (int i = 0; i < row; i++) 
	            for (int j = 0; j < column; j++) 
	                if (i > j)  
	                	if(arrayM[i][j] != 0)
	                		return false;
        }
		return true;
	}


	public boolean isTriangularInf() {
		if(!isSquare) 
            return false;
        else {  
	        for (int i = 0; i < row; i++) 
	            for (int j = 0; j < column; j++) 
	                if (i < j)  
	                	if(arrayM[i][j] != 0)
	                		return false;
        }
		return true;
	}

	public boolean isNull() {
		
		for (int i = 0; i < row; i++) 
            for (int j = 0; j < column; j++) 
                	if(arrayM[i][j] != 0)
                		return false;
	return true;
	}


	public int getRow() {

		return this.row;
	}


	public int getColumn() {

		return this.column;
	}
	
	public void addColumn() {
		
	}
	
	public void addRow() {
		
	}
	
	
	public void deleteColumn() {
		
	}
	
	public void deleteRow() {
		
	}
	
	public void addZeros() {
		for (int i = 0; i < getRow(); i++)
            for (int j = 0; j < getColumn(); j++) {
            	setValue(i, j, 0);
            }
	}

	@Override
	public String toString() {
		String matrixStr = "";

		for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) 
            	matrixStr += String.format("%10.3f ",getValue(i, j));
            matrixStr += "\n";
		}
		return matrixStr;
	}
	
	public Matrix clone() {
		return new Matrix(1);
	}
	
	public boolean equals(Object o) {
		return true;
	}
	
	/*
	 * 	private CSVLoader loadedCSV;
	 * private JSonLoader loadedJson;
	 */
	public void load(MatrixLoader loader, String file) {
		if(loader instanceof CSVLoader) {
			CSVLoader loadedCSV = new CSVLoader();
			loadedCSV.toLoad(file, this);
			
		}
		else if(loader instanceof JSonLoader) {
			System.out.println("Es json");
		}
	}
	
	
	public static void main(String[] args) {
		Matrix m1 = new Matrix(3);
	
      
		System.out.println(m1);
		System.out.println(m1.isIdentity());
        System.out.println(m1.isNull());
        System.out.println(m1.isSimmetric());
        System.out.println(m1.isTriangularInf());
        System.out.println(m1.isTriangularSup());
	}
	

}
package m.vectors;

import java.awt.Graphics2D;

import m.exceptions.*;
import m.files.*;

public class Vector {

	private int n = 2;	
	private double[] arrayV;
	private static Vector[] arrayOfVectors;
	
	public Vector(int n) throws NegativeNumberFoundException, InsufficientComponentsException {
		if(n < 0) 
			throw new NegativeNumberFoundException(n);
		if(n < 2)
			throw new InsufficientComponentsException(n);
		else {
			arrayV = new double[n];
			this.n = n;
			addZeros();
		}
		
	}
	
	public int getN() {
		return this.n;
	}
	
	public void setComponent(int n, double value) {
		arrayV[n] = value;
		
	}
	
	public double getComponent(int n) {
		return arrayV[n];
	}
	
	public void addZeros() {
		for(int i = 0; i < this.n; i++) {
			setComponent(i, 0);
		}
	}
	
	public double magnitude() {
		double m = 0;
		for(int i = 0; i < this.n; i++)
			m += Math.pow(getComponent(i), 2);
		return Math.sqrt(m);
	}
	
	public static Vector[] getArrayOfVectors() {
		return Vector.arrayOfVectors;
	}
	
	@Override
	public String toString() {
		String vStr = "<";
		for(int i = 0; i < this.n; i++) {
			vStr += String.format(" %.2f", getComponent(i));
			if(i<n-1)
				vStr += ",";
			}
		vStr += " >";
		return vStr;
	}
	
	@Override
	public Vector clone() {
		try {
			Vector copy = new Vector(this.n);
			for(int i = 0; i < this.n; i++)
				copy.setComponent(i, this.getComponent(i));	
			return copy;
		} catch (NegativeNumberFoundException | InsufficientComponentsException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Vector)) return false;
		else {
			Vector cmp = (Vector) o;
			boolean size = this.n == cmp.n;
			if(!size) return false;
			else {
				for(int i = 0; i < this.n; i++) {
					if(this.getComponent(i) != cmp.getComponent(i)) return false;
				}
			}
		} 
		return true;
	}
	
	public double dot(Vector vd) throws IllegalVectorOperationException{
		if(this.getN() != vd.getN()) {
			throw new IllegalVectorOperationException();
		}
		double pdot = 0;
		for(int i = 0; i < getN(); i++ ) {
			pdot += (this.getComponent(i) * vd.getComponent(i));
		}
		return pdot;
	}
	
	public Vector cross(Vector vc) throws IllegalVectorOperationException{
		if(this.getN() != 3 && vc.getN() != 3) {
			throw new IllegalVectorOperationException();
		}
		Vector cross = this.clone();
		if(this.getN() == 3) {
			cross.setComponent(0, (this.getComponent(1)*vc.getComponent(2))-(this.getComponent(2)*vc.getComponent(1)));
			cross.setComponent(1, (this.getComponent(2)*vc.getComponent(0))-(this.getComponent(0)*vc.getComponent(2)));
			cross.setComponent(2, (this.getComponent(0)*vc.getComponent(1))-(this.getComponent(1)*vc.getComponent(0)));
		}
		return cross;
	}
	
	public Vector sum(Vector vc) throws IllegalVectorOperationException{
		if(this.getN() != vc.getN()) {
			throw new IllegalVectorOperationException();
		}
		else {
			Vector sum = this.clone();
			for(int i =0; i < getN(); i++)
				sum.setComponent(i, this.getComponent(i)+vc.getComponent(i)); 
			return sum;
		}
	}

	public Vector substraction(Vector vc) throws IllegalVectorOperationException{
		if(this.getN() != vc.getN()) {
			throw new IllegalVectorOperationException();
		}
		else {
			Vector sub = this.clone();
			for(int i =0; i < getN(); i++)
				sub.setComponent(i, this.getComponent(i)-vc.getComponent(i)); 
			return sub;
		}
	}
	
	public void load(MatrixLoader loader, String file) {
		if(loader instanceof CSVLoader) {
			CSVLoader loadedCSV = new CSVLoader();
			loadedCSV.toLoad(file, this);
		}
	}
	
	public void save(MatrixSaver saver, String file) {
		if(saver instanceof CSVSaver) {
			CSVSaver savedCSV = new CSVSaver();
			savedCSV.toSave(file, this);
		}
	}
	
	public static void graphSum(Vector v1, Vector v2) throws IllegalVectorOperationException {
		if(!(v1.getN() == 2 && v2.getN() == 2)) 
			throw new IllegalVectorOperationException();
		else {
			arrayOfVectors = new Vector[3];
			arrayOfVectors[0] = v1;
			arrayOfVectors[1] = v2;
			arrayOfVectors[2] = v1.sum(v2);
			new Ventana();
		}
	}
	
	public static void graphSubstraction(Vector v1, Vector v2) throws IllegalVectorOperationException {
		if(!(v1.getN() == 2 && v2.getN() == 2)) 
			throw new IllegalVectorOperationException();
		else {
			arrayOfVectors = new Vector[3];
			arrayOfVectors[0] = v1;
			arrayOfVectors[1] = v2;
			arrayOfVectors[2] = v1.substraction(v2);
			new Ventana();
		}
	}
	
	public static void graphParallelogramRule(Vector v1, Vector v2) throws IllegalVectorOperationException {
		if(!(v1.getN() == 2 && v2.getN() == 2)) 
			throw new IllegalVectorOperationException();
		else {
			
			Vector s = v1.sum(v2);
			Vector v3 = v1.clone();
			v3.setComponent(0, s.getComponent(0));
			v3.setComponent(1, s.getComponent(1));
			
			arrayOfVectors = new Vector[4];
			arrayOfVectors[0] = v1;
			arrayOfVectors[1] = v2;
			arrayOfVectors[2] = v3;
			arrayOfVectors[3] = v1;
			new Ventana();
			
		}
	}
	
	public static void graphScalarMultiplication(Vector v, double c) throws IllegalVectorOperationException{
		System.out.println("s");
		if(v.getN() != 2) 
			throw new IllegalVectorOperationException();
		else {
			
			Vector scalar = v.clone();
			for(int i = 0; i < scalar.getN(); i++)
				scalar.setComponent(i, scalar.getComponent(i)*c);
			
			arrayOfVectors = new Vector[2];
			arrayOfVectors[0] = v;
			arrayOfVectors[1] = scalar;
			new Ventana();
		}
	
	
	}
	

}

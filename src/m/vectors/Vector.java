package m.vectors;

import m.exceptions.*;
//import m.matrices.*;
import m.files.*;

public class Vector {
	/*
	 * magnitud, direccion (angulo) y sentido (pos, neg)
	 * magnitud: sqrt(x^2+y^2+z^2+...n^2)
	 * direccion (a. directores): alfa (vector con x), beta (vector con y), 
	 * gama (vector con z)
	 * 	-> cos(alpha) = x/magnitud
	 *  -> cos(beta) = y/magnitud
	 *  -> cos(gama) = z/magnitud 
	 *  (sacar arcs) y v. unitario = (cos(a), cos(b), cos(y))
	 *  
	 *  sentido: 
	 *  
	 */
	private int n = 2;	
	private double[] arrayV;
	
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
			return new Vector(this.n);
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
					if(this.arrayV[i] != cmp.arrayV[i]) return false;
				}
				
			}
		} return true;
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

}

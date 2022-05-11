package m.tests;


import m.files.*;
import m.matrices.*;

public class TestMatrix {
	
	public static void main(String[] args) {

		Matrix m1 = new Matrix(3);
		System.out.println(m1);

		MatrixLoader loader1 = new CSVLoader();
		m1.load(loader1, "new.csv");
		System.out.println("con csv:");
		System.out.println(m1);
		m1.setValue(0, 0, 67.8);
		m1.setValue(1, 2, 2700.9);
		System.out.println(m1);
		System.out.println(m1.getRow());
		
	}


	
}

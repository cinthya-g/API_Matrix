package m.files;

import java.io.*;
import m.matrices.*;
import m.vectors.*;

/**
 * Clase general que implementa el guardado de un archivo <b>.csv</b> por crear.
 * <p>
 * Guarda un archivo .csv separando los valores por comas y convirtiendo números reales
 * a valores de cadenas de texto (String).
 *  </p>
 * @author Cinthya G, Iker J, Valeria R
 *
 */
public class CSVSaver extends MatrixSaver {
	
	/**
	 * Construye un objeto de dicho tipo.
	 */
	public CSVSaver() {
		
	}
	
	public void toSave(String file, Matrix m) {
		
		setFile(file);
		BufferedWriter writer = null;
	
		try {
			writer = new BufferedWriter(new FileWriter(getFullPath()));
			
			for(int i = 0; i < m.getRow(); i++) {
				for(int j = 0; j < m.getColumn(); j++) {
					double vDbl = m.getValue(i, j);
					String vStr = String.valueOf(vDbl);
					writer.write(vStr+",");
				}
				writer.write("\n");
			}
			writer.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Método sobrecargado que guarda un archivo del formato recibido implementando un objeto Vector.
	 * @param file Nombre del archivo (tiene que terminar en .csv).
	 * @param v Vector en el cual se cargará (objto Vector).
	 */
	public void toSave(String file, Vector v) {
		setFile(file);
		try {
		
			BufferedWriter writer = new BufferedWriter(new FileWriter(getFullPath()));
			for(int i = 0; i < v.getN(); i++) {
				String vStr = String.valueOf(v.getComponent(i));
				writer.write(vStr+",");
			}
			writer.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}

package m.files;

import java.io.*;
import m.matrices.*;
import m.vectors.*;

/**
 * Clase general que implementa el cargado de un archivo <b>.csv</b> existente.
 * <p>
 * Carga un archivo .csv al convertir su contenido en un arreglo
 *  de tipo String eventualmente convertido a valores de números reales.
 *  </p>
 * @author Cinthya G, Iker J, Valeria R
 *
 */
public class CSVLoader extends MatrixLoader {
	
	/**
	 * Construye un objeto de dicho tipo.
	 */
	public CSVLoader() {
		
	}
	

	public void toLoad(String file, Matrix m) {
		
		int c = 0, r = 0;
		setFile(file);
		BufferedReader reader = null;
		String line = null;

		try {
			reader = new BufferedReader(new FileReader(getFullPath()));

			while((line = reader.readLine()) != null) {
				String[] row = line.split(",");
				
				for(String index : row) {
					double dblValue = Double.parseDouble(index);
					m.setValue(r, c, dblValue);
				
					c++;
					if(c >= m.getColumn()) c = 0;
				}
				
				r++;
				if(r >= m.getRow()) r = 0;
			}
			
			reader.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	/**
	 * Método sobrecargado que carga un archivo del formato recibido implementando un objeto Vector.
	 * @param file Nombre del archivo (tiene que terminar en .csv).
	 * @param v Vector en el cual se cargará (objto Vector).
	 */
	public void toLoad(String file, Vector v) {
		setFile(file);
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(getFullPath()));
			String line = reader.readLine();
			String[] arrLine = line.split(",");
			
			int i = 0;
			for(String val : arrLine) 
				v.setComponent(i++, Double.parseDouble(val));
			
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

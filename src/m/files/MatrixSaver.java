package m.files;

import m.matrices.Matrix;

/**
 * Establece una ruta predeterminada en donde se almacenarán los archivos
 * .csv y .json que se generen con su respectivo nombre (file); 
 *  se guardarán en la carpeta "savedfiles" dentro del proyecto.
 * @author Cinthya G, Iker J, Valeria R
 *
 */

public abstract class MatrixSaver {

	private static String fullPath;
	private String file;
	private String directory = "savedfiles\\";


	public void setFile(String file) {
		this.file = file;
	}
	
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	
	public String getFile() {
		return this.file;
	}
	
	
	public String getDirectory() {
		return this.directory;
	}
	

	public String getFullPath() {
		fullPath = null;
		fullPath = this.directory + this.file;
		return fullPath;
	}
	
	public abstract void toSave(String file, Matrix m);
	
}

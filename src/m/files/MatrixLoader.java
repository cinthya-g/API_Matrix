package m.files;

import m.matrices.Matrix;


/**
 * Clase que almacena la ruta relativa de cargado de archivos y permite su recuperación y modificación.
 * <p>
 * Establece una ruta predeterminada en donde se leerán los archivos
 * <b>.csv</b> y <b>.json</b> que se soliciten por el usuario con su respectivo nombre (file); 
 *  se leerán desde la carpeta <i>savedfiles</i> dentro del proyecto.
 *  </p>
 *  
 * @author Cinthya G, Iker J, Valeria R
 *
 */
public abstract class MatrixLoader {

	private static String fullPath;
	private String file;
	private String directory = "savedfiles\\";

	/**
	 * Cnostruye un objeto de dicho tipo.
	 */
	public MatrixLoader() {
		
	}
	
	/**
	 * Especifica el nombre del archivo a leer.
	 * @param file Nombre del archivo (tiene que terminar en .csv o .json).
	 */
	public void setFile(String file) {
		this.file = file;
	}
	
	/**
	 * Especifica el directorio de recuperación de archivos en caso de cambiar el predeterminado.
	 * @param directory Ruta relativa de la carpeta de lectura.
	 */
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	
	/**
	 * Retorna el string con el nombre del archivo que se lee.
	 * @return String con nombre del archivo.
	 */
	public String getFile() {
		return this.file;
	}
	
	/**
	 * Retorna el string con el nombre de la ruta relativa de lectura.
	 * @return String con nombre del directorio (carpetas).
	 */
	public String getDirectory() {
		return this.directory;
	}
	
	/**
	 * Retorna el string con la totalidad de la ruta relativa de lectura (directorio + nombre archivo)
	 * @return Ruta relativa de lectura.
	 */
	public String getFullPath() {
		fullPath = null;
		fullPath = this.directory + this.file;
		return fullPath;
	}
	
	/**
	 * Método heredado por las subclases que cargan un archivo dependiendo de su formato.
	 * @param file Nombre del archivo (tiene que terminar en .csv o .json).
	 * @param m Matriz en la cual se cargará (objeto Matrix).
	 */
	public abstract void toLoad(String file, Matrix m);
	
}

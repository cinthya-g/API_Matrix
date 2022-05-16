package m.files;

import m.matrices.Matrix;

/**
 * Clase que almacena la ruta relativa de guardado de archivos y permite su recuperación y modificación.
 * <p>
 * Establece una ruta predeterminada en donde se almacenarán los archivos
 * <b>.csv</b> y <b>.json</b> que se generen con su respectivo nombre (file); 
 *  se guardarán en la carpeta <i>savedfiles</i> dentro del proyecto.
 *  </p>
 *  
 * @author Cinthya G, Iker J, Valeria R
 *
 */

public abstract class MatrixSaver {

	private static String fullPath;
	private String file;
	private String directory = "savedfiles\\";

	/**
	 * Construye un objeto de dicho tipo.
	 */
	public MatrixSaver() {
		
	}
	
	/**
	 * Guarda el nombre del archvio a generar
	 * @param file Nombre del archivo (tiene que terminar en .csv o .json)
	 */
	public void setFile(String file) {
		this.file = file;
	}
	
	/**
	 * Guarda el directorio de guardaddo en caso de cambiar el predeterminado
	 * @param directory Ruta relativa de la carpeta de guardado
	 */
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	
	/**
	 * Retorna el string con el nombre del archivo guardado.
	 * @return String con el nombre del archivo.  
	 */
	public String getFile() {
		return this.file;
	}
	
	/**
	 * Retorna el string con el nombre de la ruta relativa de guardado.
	 * @return Ruta relativa de guardado.
	 */
	public String getDirectory() {
		return this.directory;
	}
	
	/**
	 * Retorna el string con la totalidad de la ruta relativa de guardado (directorio + nombre archivo).
	 * @return Ruta relativa y archivo
	 */
	public String getFullPath() {
		fullPath = null;
		fullPath = this.directory + this.file;
		return fullPath;
	}
	
	/**
	 * Método heredado por las subclases que guardan dependiendo del formato del archivo.
	 * @param file Nombre del archivo (tiene que terminar en .csv o .json).
	 * @param m Matriz a guardar (objeto Matrix).
	 */
	public abstract void toSave(String file, Matrix m);
	
}

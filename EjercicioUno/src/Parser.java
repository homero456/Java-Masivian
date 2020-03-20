
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This class is thread safe.
 */
public class Parser  {
	private static final Parser inst= new Parser();
	
	private Parser() {
        super();
    }
	
	private File file;

	public synchronized void setFile(File f) {
		file = f;
	}

	public synchronized File getFile() {
		return file;
	}

	//No es synchronized
	public synchronized String getContent() throws IOException {
		FileInputStream i = new FileInputStream(file);
		//Utilizar stringBuffer para reducir incremento de memoria
		String output = "";
		int data;
		while ((data = i.read()) > 0) {
			output += (char) data;
		}	
		
		// se debe manejar una excepcion try catch y en el finally cerrar el stream
		return output;
	}
	
	//No es synchronized
	public String getContentWithoutUnicode() throws IOException {
		FileInputStream i = new FileInputStream(file);
		//Utilizar stringBuffer para reducir incremento de memoria
		String output = "";
		int data;
		while ((data = i.read()) > 0) {
			if (data < 0x80) {
				output += (char) data;
			}
		}
		// se debe manejar una excepcion try catch y en el finally cerrar el stream
		return output;
	}
	//No es synchronized
	// Cuando guarda este metodo sobreescribe lo que hay en el archivo
	public synchronized void saveContent(String content) throws IOException {
		FileOutputStream o = new FileOutputStream(file);
		try {

			for (int i = 0; i < content.length(); i += 1) {
				o.write(content.charAt(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		// crear el finally para cerrar el stream
	}
	
	
	public static Parser getInstance() {
        return inst;
    }
}

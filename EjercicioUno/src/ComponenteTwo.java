
import java.io.File;


public class ComponenteTwo extends Thread {

	@Override
    public void run() {
        
    	//Parser p = new Parser();
		
		File archivo = null;
		
		
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File("C:\\java\\java.txt");
			
			Parser.getInstance().setFile(archivo);
			
			System.out.println(Parser.getInstance().getContent()+"antes");
			
			Parser.getInstance().saveContent("hola mundo componente dos");
			System.out.println(Parser.getInstance().getContent()+"despues");
			
			//System.out.wait();
			// Lectura del fichero
			//String linea;
			//while ((linea = br.readLine()) != null)
			//System.out.println(linea);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta
			// una excepcion.
			try {
				//if (null != fr) {
				//	fr.close();
				//}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
    	
    }
 

}

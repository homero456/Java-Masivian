import java.io.File;

public class ComponentThree extends Thread {
	@Override
    public void run() {
        
    	Parser p = new Parser();
		
		File archivo = null;
		
		
		try {
			// Apertura del fichero y creacion de BufferedReader para poder
			// hacer una lectura comoda (disponer del metodo readLine()).
			archivo = new File("C:\\java\\java.txt");
			
			p.setFile(archivo);
			
			System.out.println(p.getContent());
			
			//Thread.sleep(2000);
			p.saveContent("hola mundo componente Tres");
			
			System.out.println(p.getContent()+"despues");
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
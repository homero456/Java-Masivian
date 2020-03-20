import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;






public class Test  {

	 private static final ComponentOne componentOne = new ComponentOne();
	 private static final ComponenteTwo componenteTwo = new ComponenteTwo();
	 private static final ComponentThree componentTres = new ComponentThree();	
	 public static void main(String[] args) {

		

		try {
			componentOne.start();
			componenteTwo.start();
			componentTres.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}

	}

}

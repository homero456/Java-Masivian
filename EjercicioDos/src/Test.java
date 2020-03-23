
public class Test {

	public static void main(String[] args) {
		
		int cantPrimes=1000; //cantidad numero primos
		int cantRows =5; //cantidad filas
		int cantColumns=4; //cantidad columnas
		GeneratePrimes gp = new GeneratePrimes();
		var list= gp.GeneratePrimes(cantPrimes);
		Printer p = new Printer(cantRows,cantColumns,list);
		p.Print();
		

	}

}

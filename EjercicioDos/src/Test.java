
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeneratePrimes gp = new GeneratePrimes();
		Printer p = new Printer(5,4);
		var list= gp.GetPrimes();
		p.Start(list);
		

	}

}


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cantPrimes=1000;
		int cantRows =5;
		int cantColumns=4;
		GeneratePrimes gp = new GeneratePrimes(cantPrimes);
		
		
		Printer p = new Printer(cantRows,cantColumns);
		var list1= gp.GetPrimes();
		var list2= gp.GeneratePrimes();
		System.out.print(" List1 "+list1.length);
		System.out.print(" List2 " +list2.length);
		
		p.Start(list2);
		

	}

}

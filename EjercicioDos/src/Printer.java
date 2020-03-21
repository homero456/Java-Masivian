
public class Printer {
	
	private int cantPrimes;
	private int RR;  //Numero de filas
	private int CC;	  //Numero de columnas
	
	public Printer(int RR, int CC) {
		this.CC=CC;
		this.RR=RR;
	}
	
	public void Start(int P[]) {
		this.cantPrimes = P.length -1;
		int PAGENUMBER = 1;
		int PAGEOFFSET = 1;
		while (PAGEOFFSET <= cantPrimes) {
			PrintHeader(cantPrimes,PAGENUMBER);
			PrintBody(PAGEOFFSET,P);
			PrintFoot();
			PAGENUMBER++;
			PAGEOFFSET += RR * CC;
		}
	}
	
	public void PrintHeader(int cantPrimes,int PAGENUMBER) {
		System.out.print("The First ");
		System.out.print(Integer.toString(cantPrimes));
		System.out.print(" Prime Numbers === Page ");
		System.out.print(Integer.toString(PAGENUMBER));
		System.out.println("\n");
	}
	
	public void PrintBody(int PAGEOFFSET, int P[]) {
		int ROWOFFSET;
		int C;
		for (ROWOFFSET = PAGEOFFSET; ROWOFFSET <= PAGEOFFSET + RR - 1; ROWOFFSET++) {
			for (C = 0; C <= CC - 1; C++)
				if (ROWOFFSET + C * RR <= cantPrimes)
					System.out.printf("%10d", P[ROWOFFSET + C * RR]);
			System.out.println();
		}
	}
	
	public void PrintFoot() {
		System.out.println("end page \f");
	}
	
}
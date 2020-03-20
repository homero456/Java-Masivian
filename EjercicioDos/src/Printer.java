
public class Printer {
	
	public void Start(int P[]) {
		final int M = 1000;
		int PAGENUMBER;
		int PAGEOFFSET;
		int ROWOFFSET;
		int C;
		final int RR = 50;
		final int CC = 4;
		
		PAGENUMBER = 1;
		PAGEOFFSET = 1;
		while (PAGEOFFSET <= M) {
			System.out.print("The First ");
			System.out.print(Integer.toString(M));
			System.out.print(" Prime Numbers === Page ");
			System.out.print(Integer.toString(PAGENUMBER));
			System.out.println("\n");
			for (ROWOFFSET = PAGEOFFSET; ROWOFFSET <= PAGEOFFSET + RR - 1; ROWOFFSET++) {
				for (C = 0; C <= CC - 1; C++)
					if (ROWOFFSET + C * RR <= M)
						System.out.printf("%10d", P[ROWOFFSET + C * RR]);
				System.out.println();
			}
			System.out.println("\f");
			PAGENUMBER++;
			PAGEOFFSET += RR * CC;
		}
	}
}
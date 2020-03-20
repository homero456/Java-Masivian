
public class GeneratePrimes {

	
	public int[] GetPrimes() {
		final int M = 1000;
		
		final int ORDMAX = 30;
		int P[] = new int[M + 1];
		
		int J;
		int K;
		boolean JPRIME;
		int ORD;
		int SQUARE;
		int N = 0;
		int MULT[] = new int[ORDMAX + 1];
		J = 1;
		K = 1;
		P[1] = 2;
		ORD = 2;
		SQUARE = 9;
		while (K < M) {
			do {
				J += 2;
				if (J == SQUARE) {
					ORD++;
					SQUARE = P[ORD] * P[ORD];
					MULT[ORD - 1] = J;
				}
				N = 2;
				JPRIME = true;
				while (N < ORD && JPRIME) {
					while (MULT[N] < J)

						MULT[N] += P[N] + P[N];
					if (MULT[N] == J)
						JPRIME = false;
					N++;
				}
			} while (!JPRIME);
			K++;
			P[K] = J;
		}
		
		return P;
	}
	
}

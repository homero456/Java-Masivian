
import java.util.ArrayList;
import java.util.List;

public class GeneratePrimes {

	private int cantPrimes;
	public GeneratePrimes(int cantPrimes) {
		this.cantPrimes=cantPrimes;
	}
	
	public int[] GeneratePrimes()
	{
		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
	    int nextPrime = 3;
	    while (primes.size() < cantPrimes)
	    {
	        if (esPrimo(nextPrime))
	        {
	            primes.add(nextPrime);
	        }
	        nextPrime += 2;
	    }
	    return primes.stream().mapToInt(i->i).toArray();
	}
	
	
	private boolean esPrimo(int numero)
    {
        int divisor = 2;
        int resto = 0;
        while (divisor < numero)
        {
            resto = numero % divisor;
            if(resto == 0)
            {
                return false;
            }
            divisor = divisor + 1;
        }
        return true;
    }
	
	public int[] GetPrimes() {
		
		
		final int ORDMAX = 30;
		int P[] = new int[cantPrimes + 1];
		
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
		while (K < cantPrimes) {
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


import java.util.ArrayList;
import java.util.List;

public class GeneratePrimes implements IPrimes {

	private List<Integer> primes;	
	private int cantPrimes;
	public GeneratePrimes() {		
		this.primes = new ArrayList<Integer>();
	}
	
	//Genera la cantidad de números primos
	public int[] GeneratePrimes(int cantPrimes)
	{
		this.cantPrimes=cantPrimes;
		SetPrimeTwo();
	    int nextPrime = 3;
	    while (this.primes.size() < cantPrimes)
	    {
	        if (EsPrimo(nextPrime))
	        {
	        	this.primes.add(nextPrime);
	        }
	        nextPrime += 2;
	    }
	    return this.primes.stream().mapToInt(i->i).toArray();
	}
	
	//Setea el número dos como primo
	public void SetPrimeTwo() 
	{
		this.primes.add(2);
	}	
	
	//Valida si el número es primo
	public boolean EsPrimo(int numero)
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
	
}

/**
 * Euler 10- Summation of Primes 
 * 
 * @author Mathew Kirschbaum
 * 
 */

import java.util.BitSet;

public class E10
{

	static int	VAL	= 2000000;
	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}	
	
	static Long run()
	{
		BitSet nonPrimes = E_API.sieve(VAL);
		long sum = 0;
		for (int i = 2; i <= VAL; i = nonPrimes.nextClearBit(i + 1))
		{
			sum += i;
		}
		return sum;
	}

}

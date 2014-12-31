import java.util.ArrayList;
import java.util.BitSet;

public class E_API
{

	static int MAX_BITSET_INDEX = (int) Math.sqrt(Integer.MAX_VALUE);

	static boolean checkSlow(long n)
	{
		if (n == 2)
		{
			return true;
		}
		if (n % 2 == 0)
		{
			return false;
		}
		for (long i = 3; i <= Math.sqrt(n); i += 2)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}

	static boolean check6K(long n)
	{
		// Random fast checks
		if (n == 1)
		{
			return false;
		}
		if (n < 4)
		{
			return true;
		}
		if (n % 2 == 0)
		{
			return false;
		}
		if (n < 9)
		{
			return true;
		}
		if (n % 3 == 0)
		{
			return false;
		}

		// 6k +- 1
		long r = (long) Math.sqrt(n);
		for (long f = 5; f <= r; f += 6)
		{
			if (n % (f) == 0 || n % (f + 2) == 0)
			{
				return false;
			}
		}
		return true;
	}

	public static BitSet sieve(int n)
	{
		BitSet nonPrimes = new BitSet(n + 1);

		int p = 2;
		for (; p <= Math.sqrt(n); p = nonPrimes.nextClearBit(p + 1))
		{
			for (int i = p * p; i <= n; i += p)
				nonPrimes.set(i);
		}
		/*
		 * for (; p <= n; p = nonPrimes.nextClearBit(p + 1)) { primes.add(p); }
		 */
		return nonPrimes;
	}

	static ArrayList<Integer[]> primeFactorsBySieve(int n)
	{
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();
		BitSet nonPrimes = sieve(n);
		// Determine # of prime factors
		// Get prime factors
		for (int i = 2; i < nonPrimes.length(); i++)
		{
			if (!nonPrimes.get(i) && n % i == 0)
			{
				int m = n;
				int count = 0;
				while (m % i == 0)
				{
					m /= i;
					count++;
				}
				Integer[] a = { i, count };
				list.add(a);
			}
		}
		return list;
	}

	static ArrayList<Integer[]> primeFactorsBySieve(int n, BitSet nonPrimes)
	{
		int len = (int) Math.sqrt(n) + 1;
		ArrayList<Integer[]> list = new ArrayList<Integer[]>();
		// Determine # of prime factors
		// Get prime factors
		if (check6K(n))
		{
			Integer[] a = { n, 1 };
			list.add(a);
			return list;
		}
		for (int i = 2; i < n; i++)
		{
			if (!nonPrimes.get(i) && n % i == 0)
			{
				int m = n;
				int count = 0;
				while (m % i == 0)
				{
					m /= i;
					count++;
				}
				Integer[] a = { i, count };
				list.add(a);
			}
		}
		return list;
	}

	static ArrayList<Long> primeFactors(long n)
	{
		ArrayList<Long> f = new ArrayList<Long>();
		// Print the number of 2s that divide n
		while (n % 2 == 0)
		{
			f.add(2L);
			n = n / 2;
		}

		// n must be odd at this point. So we can skip one element (Note i = i
		// +2)
		for (long i = 3; i <= Math.sqrt(n); i += 2)
		{
			// While i divides n, print i and divide n
			while (n % i == 0)
			{
				f.add(i);
				n = n / i;
			}
		}

		// This condition is to handle the case when n is a prime number
		// greater than 2
		if (n > 2)
			f.add(n);

		return f;
	}

	static int divisorCount(int n)
	{
		ArrayList<Integer[]> list = primeFactorsBySieve(n);
		int count = 1;
		for (Integer[] i : list)
		{
			count *= i[1] + 1;
		}
		return count;
	}

	static long fac(int n)
	{
		long factorial = 1;
		for (int i = 2; i <= n; i++)
		{
			factorial *= i;
		}
		return factorial;
	}

	static int gcf(int a, int b) {
		  int r, i;
		  while(b!=0){
		    r = a % b;
		    a = b;
		    b = r;
		  }
		  return a;
		}

	static String debugArray(Object[] array)
	{
		String str = "{";
		for (Object i : array)
		{
			str += " " + i + ",";
		}
		return str + " }";
	}
}

/**
 * Euler 3- Largest Prime Factor
 * 
 * @author Mathew Kirschbaum
 * 
 */

public class E3
{
	static long	VAL = 600851475143L;
	static void val(String val)
	{
		VAL = Long.parseLong(val);
	}
	
	static Long run()
	{
		long n = (long) Math.sqrt(VAL);
		n -= (n % 2 == 0 ? 1 : 0);

		while (true)
		{
			if (VAL % n != 0)
			{
				n -= 2;
				continue;
			}

			if (E_API.check6K(n)) { return n; }

			n -= 2;
		}
	}
}

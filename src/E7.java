/**
 * Euler 7- 10001st Prime
 * 
 * @author Mathew Kirschbaum
 * 
 */

public class E7
{

	static int VAL = 10001;
	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}
	
	static Long run()
	{
		int primeIndex = 2;
		for (long i = 3; true; i += 2)
		{
			if (E_API.check6K(i))
			{
				if (primeIndex == VAL) { return i; }
				primeIndex++;
			}
		}
	}

}

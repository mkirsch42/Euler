/**
 * Euler 2- Even Fibonacci Numbers
 * 
 * @author Mathew Kirschbaum
 * 
 */

public class E2
{

	static long VAL = 4000000;
	static void val(String val)
	{
		VAL = Long.parseLong(val);
	}
	
	static Integer run()
	{
		int toAdd = 1;
		int f = 2;
		int sum = 0;
		while (f < VAL)
		{
			sum += f;
			int a = toAdd;
			toAdd = 2 * f + toAdd;
			f = f + a + toAdd;
		}
		return sum;
	}

}

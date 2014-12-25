/**
 * Euler 6- Sum Square Difference
 * 
 * @author Mathew Kirschbaum
 * 
 */

public class E6
{

	static int VAL = 100;
	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}
	
	static Long run()
	{
		long sumOfSquares = 0;
		for (int i = 1; i <= VAL; i++)
		{
			sumOfSquares += i * i;
		}

		long squareOfSum = 0;
		for (int i = 1; i <= VAL; i++)
		{
			squareOfSum += i;
		}
		squareOfSum *= squareOfSum;

		return squareOfSum - sumOfSquares;
	}

}

/**
 * Euler 12- Highly Divisible Triangular Number
 * 
 * @author Mathew Kirschbaum
 * 
 */

public class E12
{
	
	static int	VAL	= 500;
	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}	
	
	static Integer run()
	{
		int toAdd = 1;
		int triNum = 0;
		while (true)
		{
			triNum += toAdd;
			toAdd++;
			if (E_API.divisorCount(triNum) >= VAL) { return triNum; }
		}
	}

}

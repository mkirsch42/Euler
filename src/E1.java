/**
 * Euler 1- Multiples of 3 and 5
 * 
 * @author Mathew Kirschbaum
 * 
 */

public class E1
{

	static int VAL = 1000;
	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}
	
	static Integer run()
	{
		int a = 0;
		for (int i = 0; i < VAL; i++)
		{
			if (i % 3 == 0 || i % 5 == 0)
			{
				a += i;
			}
		}
		return a;
	}

}

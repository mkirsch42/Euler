/**
 * Euler 15- Lattice paths
 * 
 * @author Mathew Kirschbaum
 *
 */

public class E15
{	
	
	static int	VAL	= 20;
	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}	
	
	static Long run()
	{
		double k = VAL;
		double n = 2*k;
		double result = 1;
		for (double i = 1; i<=k; i++)
		{
			result *= (n+1-i)/i;
		}
		return (long)(result+0.5);
	}
	
}

import java.util.BitSet;
import java.util.Hashtable;

/**
 * Euler 14- Largest Collatz sequence
 * 
 * @author Mathew Kirschbaum
 *
 */

public class E14
{

	static Hashtable<Long,Integer> values;
	
	static int	VAL	= 1000000;
	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}	
	
	static int getChainLength(long n)
	{
		while (n>1)
		{
			if (values.containsKey(n))
			{
				return values.get(n);
			}
			else
			{
				if (n%2==0)
				{
					values.put(n, getChainLength(n/2)+1);
				}
				else
				{
					values.put(n, getChainLength((3*n+1)/2)+2);
				}
				return values.get(n);
			}
		}
		return 1;
	}
	
	static Integer run()
	{
		values = new Hashtable<Long,Integer>();
		int max = 0;
		int maxlen = 0;
		for (int i = VAL/2+1; i<=VAL; i+=2)
		{
			int len = getChainLength(i);
			if(len>maxlen)
			{
				maxlen = len;
				max = i;
			}
		}
		return max;
	}

}

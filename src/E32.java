import java.util.ArrayList;
import java.util.Arrays;

public class E32
{

	static void val(String val)
	{
	}

	static boolean isPanDigital(int f1, int f2, int p)
	{
		ArrayList<Number> digits = new ArrayList<Number>(Arrays.asList(1, 2,
				3, 4, 5, 6, 7, 8, 9));
		while (f1 > 0)
		{
			if (!(digits.remove(new Integer(f1 % 10))))
			{
				return false;
			}
			f1/=10;
		}
		while (f2 > 0)
		{
			if (!(digits.remove(new Integer(f2 % 10))))
			{
				return false;
			}
			f2/=10;
		}
		while (p > 0)
		{
			if (!(digits.remove(new Integer(p % 10))))
			{
				return false;
			}
			p/=10;
		}
		return digits.size()==0;
	}

	static Number run()
	{
		long sum = 0;
		ArrayList<Integer> counted = new ArrayList<Integer>();
		for (int f1 = 100; f1 < 10000; f1++)
		{
			boolean repeatless=true;
			double log1 = Math.log10(f1);
			ArrayList<Integer> digits = new ArrayList<Integer>(Arrays.asList(1, 2,
					3, 4, 5, 6, 7, 8, 9));
			for(int i=f1;i>0;i/=10)
			{
				if (!(digits.remove(new Integer(i % 10))))
				{
					repeatless=false;
					break;
				}
			}
			if(!repeatless)
			{
				continue;
			}
			for (int f2 = 1; f2 < 100; f2++)
			{
				double log2 = Math.log10(f2);
				int p = f1 * f2;
				if (Math.floor(log1)+Math.floor(log2)+Math.floor(log1+log2)==6 && !counted.contains(p) && isPanDigital(f1, f2, p))
				{
					counted.add(p);
					sum += p;
				}
			}
		}
		return sum;
	}

}

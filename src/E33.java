import java.util.BitSet;

public class E33
{
	static void val(String val)
	{
	}

	static Number run()
	{
		BitSet sieve = E_API.sieve(100);
		int g_num = 1;
		int g_den = 1;
		for (int den = 10; den < 100; den++)
		{
			for (int num = 10; num < den; num++)
			{
				int i = -1;
				int n = -1;
				int d = -1;
				if (den / 10 == num / 10)
				{
					i = den / 10;
					d = den % 10;
					n = num % 10;
				}
				else if (den / 10 == num % 10)
				{
					i = den / 10;
					d = den % 10;
					n = num / 10;
				}
				else if (den % 10 == num / 10)
				{
					i = den % 10;
					d = den / 10;
					n = num & 10;
				}
				else if (den % 10 == num % 10)
				{
					i = den % 10;
					d = den / 10;
					n = num / 10;
				}
				if (i < 1)
					continue;
				
				if (d==0 || Math.abs((num*1.0) / den - (n*1.0) / d) > 0.0000001)
					continue;
				
				g_num *= n;
				g_den *= d;
				//System.out.println(num+"/"+den+","+n+"/"+d+","+(num*1.0)/den+","+(n*1.0)/d+","+i);
			}
		}
		//System.out.println(g_num + "/" + g_den);
		return g_den/E_API.gcf(g_num,g_den);
	}
}

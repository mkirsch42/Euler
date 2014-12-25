import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;


public class E29
{

	static Integer VAL = 100;

	static HashSet<String> discreteVals;
	
	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}
	
	static String factorArrayToString(ArrayList<Integer[]> toClone)
	{
		String str = "";
		for (Integer[] i : toClone)
		{
			str += (i[0]+","+i[1]+";"
					+ "]0 ");
		}
		return str;
	}
	
	static Number run()
	{
		BitSet sieve = E_API.sieve(VAL);	
		discreteVals = new HashSet<String>();
		for (int a=2;a<=VAL;a++)
		{
			ArrayList<Integer[]> primeFactors = E_API.primeFactorsBySieve(a,sieve);
			Integer[] baseExponents = new Integer[primeFactors.size()];
			int h=0;
			for(Integer[] i : primeFactors)
			{
				baseExponents[h]=new Integer(i[1]);
				h++;
			}
			for (int b=2;b<=VAL;b++)
			{
				int j=0;
				for (Integer[] i : primeFactors)
				{
					i[1]+=baseExponents[j];
					j++;
				}
				String str=factorArrayToString(primeFactors);
				discreteVals.add(str);
			}
		}
		return discreteVals.size();
	}
	
}

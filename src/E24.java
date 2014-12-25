import java.util.ArrayList;
import java.util.Arrays;


public class E24
{

	static Integer VAL = 1000000;

	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}

	static int getBaseOfNearestFactorial(long n)
	{
		int i=1;
		while(true)
		{
			if(E_API.fac(i+1)>=n)
			{
				return i;
			}
			i++;
		}
	}
	
	static Number run()
	{
		long finalPerm = 0;
		ArrayList<Integer> working = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		long permsLeft = VAL;
		int base = getBaseOfNearestFactorial(permsLeft-1);
		while (!(permsLeft<=1))
		{
			long fac = E_API.fac(base);
			int digit = (int) ((permsLeft-1)/fac);
			finalPerm = finalPerm * 10 + working.remove(digit);
			permsLeft-=digit*fac;
			base--;
		}
		for(int i:working)
		{
			finalPerm = finalPerm*10+i;
		}
		return finalPerm;
	}
	
}

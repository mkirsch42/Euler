import java.util.ArrayList;


public class E26
{

	static Integer VAL = 1000;

	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}

	static int oneOverDLength(int d)
	{
		ArrayList<Integer> remainders = new ArrayList<Integer>();
		remainders.add(10%d);
		while(true)
		{
			int a=remainders.get(remainders.size()-1);
			if(a==0)
			{
				return 0;
			}
			int r=(10*a)%d;
			int b=remainders.indexOf(r);
			if(b>-1)
			{
				return remainders.size()-b;
			}
			remainders.add(r);
		}
	}
	
	static Number run()
	{
		int bestD=0;
		int bestDLen=0;
		for (int d=1;d<VAL;d++)
		{
			int len=oneOverDLength(d);
			if(len>bestDLen)
			{
				bestD=d;
				bestDLen=len;
			}
		}
		return bestD;
	}
	
}


public class E28
{

	static Integer VAL = 1001;

	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}

	static Number run()
	{
		int o=1;
		long sum=1;
		int s=1;
		while(2*s+1<=VAL)
		{
		  sum += 20*s+4*o;
		  o += 8*s;
		  s++;
		}
		return sum;
	}
	
}

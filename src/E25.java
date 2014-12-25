
public class E25
{

	static Integer VAL = 1000;
	static double PHI = (1+Math.sqrt(5))/2.0;
	static double LOGPHI = Math.log10(PHI);
	static double LOG5 = Math.log10(5);
	
	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}

	static Number run()
	{
		return (int)Math.ceil(((VAL-1)+(LOG5/2.0))/LOGPHI);
	}
	
}


public class E27
{

	static Long VAL = 999L;

	static void val(String val)
	{
		VAL = Long.parseLong(val);
	}

	static Number run()
	{
		long r = (int) Math.floor(Math.sqrt(4*VAL-163));
		return (-(r*r*r+163*r)/4);
	}
	
}

/**
 * Euler 9- Special Pythagorean Triplet
 * 
 * @author Mathew Kirschbaum
 * 
 */

public class E9
{

	static int	VAL	= 1000;
	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}
	
	
	static int[] getAB(int c)
	{
		int remaining = VAL - c;
		int a = remaining / 2;
		int b = remaining - a;
		while (b >= 0)
		{
			if (a * a + b * b == c * c)
			{
				int ab[] = { a, b };
				return ab;
			}
			a++;
			b--;
		}
		int fail[] = { -1, -1 };
		return fail;
	}

	static Long run()
	{
		int c = VAL / 3; // c is logically larger than TARGET/3- it is larger
							// than both a and b
		while (c <= VAL)
		{
			int ab[] = getAB(c);
			if (ab[0] != -1) { return (long) ab[0] * ab[1] * c; }
			c++; // heh.
		}
		return -1L;
	}

}

/**
 * Euler 4- Largest Palindrome Product
 * 
 * @author Mathew Kirschbaum
 * 
 */

public class E4
{

	static void val(String val){}
	
	static int toPalindrome(int n)
	{
		String s = Integer.toString(n);
		return (n * 1000)
				+ (Integer.parseInt("" + s.charAt(2) + s.charAt(1)
						+ s.charAt(0)));
	}

	static boolean is3DigitProduct(int n)
	{
		int x = (int) Math.sqrt(n);
		for (int i = 100; i <= x; i++)
		{
			if ((n % i == 0) && n / i > 99 && n / i < 1000) { return true; }
		}
		return false;
	}

	static Integer run()
	{
		int n = 999;
		while (true)
		{
			if (is3DigitProduct(toPalindrome(n))) { return toPalindrome(n); }
			n--;
		}
	}

}

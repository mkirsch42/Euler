public class E30
{

	static Integer VAL = 5;

	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}

	static boolean isDigSum(int i)
	{
		int s = 0;
		for (int p = i; p > 0 && s<=i; p /= 10)
		{
			s += Math.pow(p % 10, VAL);
		}
		return s == i;
	}

	static Number run()
	{
		int n = 1;
		int max = (int) Math.pow(9, VAL);
		for (int j = 10; j - 1 <= n * max; n++)
		{
			j *= 10;
		}
		max = (int) Math.pow(10, n);
		int sum = 0;
		for (int i = 0; i < max; i++)
		{
			if (isDigSum(i))
			{
				sum += i;
			}
		}
		return sum - 1;
	}

}

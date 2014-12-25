import java.util.Hashtable;


public class E21
{

	static Integer VAL = 10000;

	static Hashtable<Integer,Integer> nums;
	
	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}

	static Number run()
	{
		// Reset hashtable
		nums = new Hashtable<Integer,Integer>();
		// Reset sum
		int sum = 0;
		// Loop through values up to and including VAL
		for (int i=1;i<=VAL;i++)
		{
			// Sum of divisors of i
			int divisorSum = 0;
			// Sqrt of i
			int sqrt = (int) Math.sqrt(i)+1;
			// Loop through possible divisors
			for (int j=1;j<=sqrt;j++)
			{
				// If i is divisible by j...
				if (i%j==0)
				{
					// j is a divisor, add j to divisorSum
					divisorSum += j;
					// i/j is also a divisor
					divisorSum += i/j;
				}
			}
			// Proper divisors don't include the number itself
			divisorSum -= i;
			try
			{
				// If there is another pair where the divisors of divisorSum add up to i...
				if(nums.get(divisorSum)==i)
				{
					// Add both numbers to the sum
					sum += divisorSum;
					sum += i;
				}
			}catch(Exception e){}
			nums.put(i,divisorSum);
		}
		return sum;
	}
	
}

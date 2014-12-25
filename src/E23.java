import java.util.ArrayList;


public class E23
{

	static Integer VAL = 28123;

	static void val(String val){}

	static Number run()
	{
		// List of all abundant nums
		ArrayList<Integer> abundantNums = new ArrayList<Integer>();
		long sum = 0;
		boolean[] sumOfAbundant = new boolean[28123];
		// Max number that cannot be written as sum of 2 abundant nums is <28123
		for (int i=1;i<28123;i++)
		{
			// All numbers divisible by 1
			int divisorSum=1;
			// Only calculate divisors up to square root
			int sqrt = (int) Math.sqrt(i);
			for(int j=2; j<=sqrt; j++)
			{
				// Add both divisors if divisible
				if(i%j==0)
				{
					divisorSum += j;
					int secondDivisor = i/j;
					// If its not a perfect square, add the second divisor
					if (j!=secondDivisor)
					{
						divisorSum += secondDivisor;
					}
				}
			}
			// Append number to list if it is an abundant number
			if (divisorSum>i)
			{
				abundantNums.add(i);
				// Then add every smaller abundant number
				for (int x:abundantNums)
				{
					if(i+x>=28123)break;
					sumOfAbundant[i+x] = true;
				}
				
			}
		}
		
		
		for(int i=0;i<sumOfAbundant.length;i++)
		{
			if(!sumOfAbundant[i])
			{
				sum+=i;
			}
		}
		return sum;
	}
	
}


public class E20
{

	static Integer VAL = 100;

	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}

	
	static Integer run()
	{
		// Set length to proper size
		int[] digits=new int[(int) (VAL * Math.log10(VAL))];
		// Initialize to 1
		digits[0]=1;
		// Loop from 1 to the factorial value (VAL)
		for (int i=1;i<=VAL;i++)
		{
			// Set the carry to 0
			int carry=0;
			// For each digit...
			for (int j=0;j<digits.length;j++)
			{
				// Multiply it by i
				digits[j]*=i;
				// Add the carry
				digits[j]+=carry;
				// Reset the carry
				carry=0;
				// If there is more than one digit in the digit...
				if(digits[j]>9)
				{
					// Set the carry to the first digits
					carry=(digits[j]-(digits[j]%10))/10;
					// Remove all digits except the first
					digits[j]=digits[j]%10;
				}
			}
		}
		int sum=0;
		for (int i:digits)
		{
			sum+=i;
		}
		return sum;
	}
}

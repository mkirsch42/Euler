/**
 * Euler 16- Power digit sum
 * 
 * @author Mathew Kirschbaum
 *
 */

public class E16
{

	static int VAL = 1000;
	
	static int[] digits;
	
	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}
	
	static Integer run()
	{
		digits=new int[(int) (VAL*Math.log10(2))+1];
		digits[0]=1;
		int carry=0;
		for (int i=0;i<VAL;i++)
		{
			for (int j=0;j<digits.length;j++)
			{
				digits[j]*=2;
				digits[j]+=carry;
				carry=0;
				if(digits[j]>9)
				{
					digits[j]-=10;
					carry=1;
				}
			}
		}
		int sum=0;
		for (int i=0;i<digits.length;i++)
		{
			sum+=digits[i];
		}
		return sum;
	}
	
}

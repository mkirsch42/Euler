/**
 * Number letter counts
 * 
 * @author Mathew Kirschbaum
 *
 */

public class E17
{

	static int[] twoDigitNums;

	static Integer VAL = 1000;

	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}

	static int getNumLetters(int n)
	{
		if (n == 0)
		{
			return 0;
		}
		int place = (int) Math.log10(n);
		int MSB = n / (int) Math.pow(10, place);
		int length = 0;
		if (place == 3)
		{
			length += twoDigitNums[MSB];
			length += 8;
			length += getNumLetters(n % 1000);
		}
		if (place == 2)
		{
			length += twoDigitNums[MSB] + 7;
			if (n % 100 != 0)
			{
				length += 3;
				length += twoDigitNums[n % 100];
			}
		}
		if (place == 1)
		{
			length += twoDigitNums[n % 10];
			length += twoDigitNums[MSB*10];
			if(twoDigitNums[n]!=0)
			{
				length=twoDigitNums[n];
			}
			twoDigitNums[n]=length;
		}
		if (place == 0)
		{
			length += twoDigitNums[n];
		}
		return length;
	}

	static Number run()
	{
		twoDigitNums = new int[100];
		twoDigitNums[0] = 0;
		twoDigitNums[1] = 3;
		twoDigitNums[2] = 3;
		twoDigitNums[3] = 5;
		twoDigitNums[4] = 4;
		twoDigitNums[5] = 4;
		twoDigitNums[6] = 3;
		twoDigitNums[7] = 5;
		twoDigitNums[8] = 5;
		twoDigitNums[9] = 4;
		twoDigitNums[10] = 3;
		twoDigitNums[11] = 6;
		twoDigitNums[12] = 6;
		twoDigitNums[13] = 8;
		twoDigitNums[14] = 8;
		twoDigitNums[15] = 7;
		twoDigitNums[16] = 7;
		twoDigitNums[17] = 9;
		twoDigitNums[18] = 8;
		twoDigitNums[19] = 8;
		twoDigitNums[20] = 6;
		twoDigitNums[30] = 6;
		twoDigitNums[40] = 5;
		twoDigitNums[50] = 5;
		twoDigitNums[60] = 5;
		twoDigitNums[70] = 7;
		twoDigitNums[80] = 6;
		twoDigitNums[90] = 6;
		
		int sum = 0;
		for (int i = 1; i <= VAL; i++)
		{
			sum += getNumLetters(i);
		}
		return sum;
	}

}

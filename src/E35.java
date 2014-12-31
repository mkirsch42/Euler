import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;


public class E35
{

	static Integer VAL = 1000000;

	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}

	static Number run()
	{
		
		int count = 0;
		BitSet sieve = E_API.sieve(VAL);
		int i=2;
		while(i<VAL)
		{
			//System.out.println(i);
			Integer[] rotations = new Integer[(int) Math.log10(i)+1];
			ArrayList<Integer> digits = new ArrayList<Integer>();
			for (int q = i; q > 0; q /= 10)
			{
				int r = q % 10;
				digits.add(r);
			}
			Collections.reverse(digits);
			for (int j=0;j<rotations.length;j++)
			{
				int d=0;
				for (int k : digits)
				{
					d *= 10;
					d += k;
				}
				sieve.set(d);
				rotations[j]=d;
				digits.add(digits.remove(0));
				//System.out.println(d);
			}
			boolean ok = true;
			int belowVAL = 0;
			ArrayList<Integer> counted = new ArrayList<Integer>();
			for (Integer j : rotations)
			{
				if(j<VAL&&!counted.contains(j))belowVAL++;
				if(!E_API.check6K(j))
				{
					ok = false;
					break;
				}
				counted.add(j);
			}
			if(ok)
			{
				count+=belowVAL;
			}
			i=sieve.nextClearBit(i+1);
		}
		return count;
	}
	
}

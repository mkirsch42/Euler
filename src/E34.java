
public class E34
{
	static void val(String val){}

	static Number run()
	{
		int sum=0;
		int[] fac={1,1,2,6,24,120,720,5040,40320,362880};
		for(int i=3;i<9999999;i++)
		{
			int facsum = 0;
			for(int j=i;j>0;j/=10)
			{
				facsum += fac[j%10];
			}
			if(facsum==i)
			{
				sum+=i;
			}
		}
		return sum;
	}
	
}

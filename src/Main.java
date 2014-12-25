import java.util.Scanner;

// FJ 10-2

public class Main
{

	private static double arrayAverage(double[] list)
	{
		double average = 0;
		for(double i : list)
		{
			average += i;
		}
		return average/list.length;
	}
	
	public static void main(String[] args)
	{
		double[] list = new double[10];
		Scanner in = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			list[i]=in.nextDouble();
		}
		double average = arrayAverage(list);
		System.out.println(average);
		System.out.println("");
		for(double i:list)
		{
			if(i>average)
			{
				System.out.println(i);
			}
		}
	}
	
}

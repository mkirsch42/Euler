import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Euler 11- Largest Product in a Grid
 * 
 * @author Mathew Kirschbaum
 * 
 */

public class E11
{

	static Scanner	GRID;
	static Integer	DATA[][]	= new Integer[20][20];

	static void val(String val){}
	
	static Long run() throws FileNotFoundException
	{
		Long max = 0L;
		GRID = new Scanner(new File("src/E11.txt"));
		for (int i = 0; i < 20; i++)
		{
			String temp[] = GRID.nextLine().split(" ");
			for (int j = 0; j < 20; j++)
			{
				DATA[i][j] = Integer.parseInt(temp[j]);
			}
		}

		for (int i = 0; i < 17; i++)
		{
			for (int j = 0; j < 17; j++)
			{
				Long temp = (long) (DATA[i][j] * DATA[i][j + 1]
						* DATA[i][j + 2] * DATA[i][j + 3]);
				if (temp > max)
				{
					max = temp;
				}
			}
		}

		for (int i = 0; i < 17; i++)
		{
			for (int j = 0; j < 17; j++)
			{
				Long temp = (long) (DATA[j][i] * DATA[j + 1][i]
						* DATA[j + 2][i] * DATA[j + 3][i]);
				if (temp > max)
				{
					max = temp;
				}
			}
		}

		for (int i = 0; i < 17; i++)
		{
			for (int j = 0; j < 17; j++)
			{
				Long temp = (long) (DATA[j][i] * DATA[j + 1][i + 1]
						* DATA[j + 2][i + 2] * DATA[j + 3][i + 3]);
				if (temp > max)
				{
					max = temp;
				}
			}
		}

		for (int i = 0; i < 17; i++)
		{
			for (int j = 19; j > 4; j--)
			{
				Long temp = (long) (DATA[j][i] * DATA[j - 1][i + 1]
						* DATA[j - 2][i + 2] * DATA[j - 3][i + 3]);
				if (temp > max)
				{
					max = temp;
				}
			}
		}

		return max;
	}
}

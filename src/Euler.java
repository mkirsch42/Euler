import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * Project Euler Test Wrapper
 * 
 * @author Mathew Kirschbaum
 * @version 2014.10.23
 * 
 */
public class Euler
{

	static int LOOPS = 10;

	public static void main(String[] input) throws NoSuchMethodException,
			SecurityException, ClassNotFoundException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException
	{
		if (input.length == 1)
		{
			String[] i = { "static String str = \n", "1" };
			input = i;
		}
		int projectNum = 0;
		boolean auto = input.length > 0;
		if (auto)
		{
			projectNum = Integer.parseInt(input[1]);
			input[1] = Integer.toString(projectNum + 1);
			System.out.println(projectNum);
		}
		else
		{
			Scanner in = new Scanner(System.in);
			input = in.nextLine().split(" ");
			projectNum = Integer.parseInt(input[0]);
			if (input.length > 1)
			{
				Class.forName("E" + projectNum)
						.getDeclaredMethod("val", String.class)
						.invoke(null, input[1]);
			}
			in.close();
		}

		Number out = null;
		Method m = Class.forName("E" + projectNum).getDeclaredMethod("run");
		m.invoke(null);
		long time = System.nanoTime();

		for (int i = 0; i < LOOPS; i++)
			out = (Number) m.invoke(null);

		if (projectNum == 0)
			return;
		long time2 = System.nanoTime();
		if (auto)
		{
			input[0] += "\t\t\t\""
					+ String.format("%02d", projectNum)
					+ "\\t"
					+ String.format("%.4E", ((time2 - time) / 1000000.0)
							/ LOOPS) + "\" + \n";
			try
			{
				Class.forName("E" + (projectNum + 1));
			} catch (ClassNotFoundException e)
			{
				System.out.println(input[0]);
				return;
			}
			main(input);
			return;
		}
		System.out.printf("%.4E%n", ((time2 - time) / 1000000.0) / LOOPS);
		System.out.println(out);

		if (input.length < 2 && !auto)
		{
			try
			{
				System.out.println(out.longValue() == E0.getAnswer(projectNum)
						.longValue());
			} catch (Exception e)
			{
			}
		}
	}
}

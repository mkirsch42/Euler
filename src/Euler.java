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
	
	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 */
	public static void main(String[] args) throws NoSuchMethodException,
			SecurityException, ClassNotFoundException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException
	{
		Scanner in = new Scanner(System.in);
		String input[] = in.nextLine().split(" ");
		int projectNum = Integer.parseInt(input[0]);
		if (input.length > 1)
		{
			Class.forName("E" + projectNum)
					.getDeclaredMethod("val", String.class)
					.invoke(null, input[1]);
		}
		in.close();
		Number out = null;
		Method m = Class.forName("E" + projectNum).getDeclaredMethod("run");
		long time = System.nanoTime();

		for (int i=0;i<LOOPS;i++)
			out = (Number) m.invoke(null);

		if (projectNum == 0)
			return;
		long time2 = System.nanoTime();
		System.out.printf("%.4E%n", ((time2 - time) / 1000000.0));
		System.out.println(out);
		if (input.length < 2)
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

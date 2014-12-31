public class E31
{

	static Integer VAL = 200;
	static final int[] VALUES = { 200, 100, 50, 20, 10, 5, 2, 1 };

	static void val(String val)
	{
		VAL = Integer.parseInt(val);
	}

	// Step 1
	static int pop1FromColumn(Integer[] columns)
	{
		for (int i = columns.length - 2;; i--)
		{
			if (columns[i] != 0)
			{
				columns[i]--;
				return i;
			}
		}
	}

	// Step 2
	static void distribute1ToColumns(Integer[] columns, int fromColumn)
	{
		int i = fromColumn + 1; // The current column to distribute to
		int remaining = VALUES[fromColumn]; // The value being distributed
		while (remaining > 0)
		{
			columns[i] += remaining / VALUES[i];
			remaining %= VALUES[i];
			i++;
		}

	}

	// Step 3
	static void consolidateToColumns(Integer[] columns, int upperBound)
	{
		int i = columns.length - 1;
		int sum = 0;
		while (i > upperBound + 1)
		{
			sum += columns[i] * VALUES[i];
			columns[i] = 0;
			i--;
		}

		i = upperBound + 1;
		while (sum > 0)
		{
			columns[i] += sum / VALUES[i];
			sum %= VALUES[i];
			i++;
		}
	}

	static Number run()
	{
		Integer[] columns = { 1, 0, 0, 0, 0, 0, 0, 0 };
		int combos = 1;

		for (; columns[columns.length - 1] < VAL; combos++)
		{
			int col = pop1FromColumn(columns);
			distribute1ToColumns(columns, col);
			consolidateToColumns(columns, col);
		}
		return combos;
	}

}

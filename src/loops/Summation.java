public class Summation
{
	public static void main(String[] args)
	{
//		Sum of numbers from integers in range
		int sum = 0;
		int counter = 0;
		while (counter <= 4)
		{
			if (counter != 2)
			{
				sum = sum + counter;
			}
			counter += 1;
		}
		System.out.println(sum);

		// 1 + 3 + 4
		//  1 2 3 4
		//  1 3 _ x
		// x = (4 + (3 + (2 + 1)) )


		


	}
}
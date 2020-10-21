public class LoopExamples
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


//		Upper to lower bound ranges

		// Range: 2 - 7
		

//		Practical Use for loops
//		Cannot use multiplication *

		// 3 * 2
		// 3 + 3, 2 amount of times

		int a = 2;
		int b = 4;
		int product = 0;

		counter = 0;
		while (counter < b) // repeats 'b' times
		{
			product = product + a; // adds 'a' every time
			counter++;
		}
		System.out.println(product);

		// n
		int n = 3;
		if (n % 3 == 0)
		{
			System.out.println("n is evenly divisible by 3");
		}
	}
}
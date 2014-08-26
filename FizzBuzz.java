import java.util.*;

public class FizzBuzz
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 100; i++)
		{
			// String out = i + "";
			// boolean divisibleBy3 = false;
			// if ((i % 3) == 0) 
			// {
			// 	out = "Fizz";
			// 	divisibleBy3 = true;
			// }
			// if ((i % 5) == 0) 
			// {
			// 	if (divisibleBy3) out += "Buzz";
			// 	else out = "Buzz";
			// }
			// System.out.println(out);

			// String out = i + "";
			// if ((i % 3) == 0) out = "Fizz";
			// if ((i % 5) == 0) out = "Buzz";
			// if (((i % 3) == 0) && ((i % 5) == 0)) out = "FizzBuzz";
			// System.out.println(out);

			int bits = 1;	// none, 3, 6
			int[] divisors = {3, 5};
			String[] fizzbuzz = {"Fizz", "Buzz"};
			for (int j = 0; j < divisors.length; j++)
				if (i % divisors[j] == 0) 
				{
					bits = bits & ~1;
					bits = bits | 1 << divisors[j];		
				}

			String out = "";
			if ((bits & 1) == 1) out = i + "";
			else
			{
				for (int j = 0; j < divisors.length; j++)
					if (((bits >> divisors[j]) & 1) == 1) 
						out += fizzbuzz[j];
			}
			System.out.println(out);
		}
	}
}
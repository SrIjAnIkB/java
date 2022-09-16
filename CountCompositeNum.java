import java.util.*;

class CountCompositeNum
{

	static int sum = 0;

	static int compositeCount(int arr[], int n)
	{
		int max_val = Arrays.stream(arr).max().getAsInt();

		Vector<Boolean> prime = new Vector<Boolean>(max_val + 1);
		for (int i = 0; i < max_val + 1; i++)
		{
			prime.add(i, Boolean.TRUE);
		}

		prime.add(0, Boolean.TRUE);
		prime.add(1, Boolean.TRUE);
		for (int p = 2; p * p <= max_val; p++)
		{

			if (prime.get(p) == true)
			{

				for (int i = p * 2; i <= max_val; i += p)
				{
					prime.add(i, Boolean.FALSE);
				}
			}
		}

		int count = 0;
		for (int i = 0; i < n; i++)
		{
			if (!prime.get(arr[i]))
			{
				count++;
				sum = sum + arr[i];
			}
		}
		return count;
	}

	public static void main(String[] args)
	{
		int arr[] = {1, 2, 3, 4, 5, 6, 7};
		int n = arr.length;

		System.out.print("Count of Composite Numbers = "
				+ compositeCount(arr, n));

		System.out.print("\nSum of Composite Numbers = " + sum);
	}
}

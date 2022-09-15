import java.util.*;
class Permutations{

static void printPermutation(int N)
{
	int temp = N, count = 0;
	while (temp > 0)
	{
	count++;
	temp /= 10;
	}

	int[] num = new int[count];

	while (N > 0)
	{
	num[count-- - 1] = N % 10;
	N = N / 10;
	}

	while (next_permutation(num))
	{

	for (int i = 0; i < num.length; i++)
		System.out.print(num[i]);

	System.out.print("\n");
	}
}

static boolean next_permutation(int[] p)
{
	for (int a = p.length - 2; a >= 0; --a)
	if (p[a] < p[a + 1])
		for (int b = p.length - 1;; --b)
		if (p[b] > p[a])
		{
			int t = p[a];
			p[a] = p[b];
			p[b] = t;
			for (++a, b = p.length - 1; a < b; ++a, --b)
			{
			t = p[a];
			p[a] = p[b];
			p[b] = t;
			}
			return true;
		}
	return false;
}
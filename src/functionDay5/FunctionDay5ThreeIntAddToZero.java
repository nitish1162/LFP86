package functionDay5;

/*
 * Sum of three Integer adds to ZERO
a. Desc -> A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.
b. I/P -> N number of integer, and N integer input array
c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
d. O/P -> One Output is number of distinct triplets as well as the second output is to
print the distinct triplets.
 */

public class FunctionDay5ThreeIntAddToZero {

	// Prints all triplets in numbers[] with 0 sum
	static void FindTriplets(int[] numbers, int n) {
		boolean found = true;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (numbers[i] + numbers[j] + numbers[k] == 0) {
						System.out.println("Below are 3 numbers whose sum is equal to 0");
						System.out.println("Numbers are :" + numbers[i] + " " + numbers[j]+ " " + numbers[k]);

						found = true;
					}
				}
			}
		}

		// If no triplet with 0 sum found in array
		if (found == false)
			System.out.println("Not exist ");

	}

	public static void main(String[] args)
	{

		int numbers[] = {2,3,-2,5,0};
		int n = numbers.length;

		FindTriplets(numbers, n);
	}

}

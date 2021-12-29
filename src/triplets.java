
/*#Pooja
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]

Example 2:
Input: nums = []
Output: []

Example 3:
Input: nums = [0]
Output: []
************/
	// Java program to find all triplets with given sum
	import java.util.*;

	public class triplets {

		// returns all triplets whose sum is
		// equal to sum value
		public static List<List<Integer>> findTriplets(int[] nums, int sum) {

			/* Sort the elements */
			Arrays.sort(nums);

			List<List<Integer>> pair = new ArrayList<>();
			TreeSet<String> set = new TreeSet<String>();
			List<Integer> triplets = new ArrayList<>();

			/*
			 * Iterate over the array from the start and consider it as the first element
			 */
			for (int i = 0; i < nums.length - 2; i++) {

				// index of the first element in the
				// remaining elements
				int j = i + 1;

				// index of the last element
				int k = nums.length - 1;

				while (j < k) {

					if (nums[i] + nums[j] + nums[k] == sum) {

						String str = nums[i] + ":" + nums[j] + ":" + nums[k];

						if (!set.contains(str)) {

							// To check for the unique triplet
							triplets.add(nums[i]);
							triplets.add(nums[j]);
							triplets.add(nums[k]);
							pair.add(triplets);
							triplets = new ArrayList<>();
							set.add(str);
						}

						// increment the second value index
						j++;

						// decrement the third value index
						k--;
					} else if (nums[i] + nums[j] + nums[k] < sum)
						j++;

					else
						k--;
				}
			}
			return pair;
		}

		// Driver code
		public static void main(String[] args) {
			int[] nums = {-1,0,1,2,-1,-4};
			int sum = 0;

			List<List<Integer>> triplets = findTriplets(nums, sum);

			// Function call
			if (!triplets.isEmpty()) {
				System.out.println(triplets);
			} else {
				System.out.println("No triplets can be formed");
			}
		}
	}

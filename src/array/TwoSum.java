package array;

import java.util.Arrays;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = { 2, 5, 5, 15 };
		new TwoSum().twoSum(nums, 10);
	}

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		result[0] = -1;
		result[1] = -1;
		int[] numsCopy = Arrays.copyOf(nums, nums.length);

		Arrays.sort(numsCopy);

		for (int i = 0, j = numsCopy.length - 1; i < j;) {
			if (numsCopy[i] + numsCopy[j] > target) {
				j--;
			} else if (numsCopy[i] + numsCopy[j] < target) {
				i++;
			} else {
				for (int count = 0; count < nums.length; count++) {
					if (nums[count] == numsCopy[i] && result[0] < 0) {
						result[0] = count;
						continue;
					}

					if (nums[count] == numsCopy[j] && result[1] < 0) {
						result[1] = count;
						continue;
					}
				}

				break;
			}
		}

		return result;
	}
}

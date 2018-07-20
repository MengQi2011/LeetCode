package array;

public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int max = Integer.MIN_VALUE;
		int cur = 0;

		for (int i = 0; i < nums.length; i++) {
			cur = Math.max(nums[i], cur + nums[i]);
			max = Math.max(max, cur);
		}

		return max;
	}
}

package array;

public class ContainerWithMostWater {
	public int maxArea2(int[] height) {
		int max = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {
				int area = (j - i) * Math.min(height[i], height[j]);
				if (area > max)
					max = area;
			}
		}
		return max;
	}

	public int maxArea(int[] height) {
		int start = 0, end = height.length - 1;
		int max = 0;

		while (start < end) {
			int area = (end - start) * Math.min(height[start], height[end]);
			max = Math.max(max, area);

			if (height[start] > height[end]) {
				end--;
			} else {
				start++;
			}
		}

		return max;
	}
}

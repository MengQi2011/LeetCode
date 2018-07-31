package array;

import java.util.LinkedList;
import java.util.Queue;

public class MoveZeroes {
	public void moveZeroes2(int[] nums) {
		int sizeOfZero = 0;
		for (int i = 0; i < nums.length - sizeOfZero;) {
			if (nums[i] == 0) {
				for (int j = i + 1; j < nums.length - sizeOfZero; j++) {
					int temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}

				sizeOfZero++;
			} else {
				i++;
			}
		}
	}

	public void moveZeroes(int[] nums) {
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				queue.add(i);
			} else {
				if (!queue.isEmpty()) {
					int location = queue.remove();
					int tmp = nums[i];
					nums[i] = 0;
					nums[location] = tmp;
					queue.add(i);
				}
			}
		}
	}

}
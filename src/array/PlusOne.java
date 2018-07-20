package array;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		int carry = 1;

		for (int i = digits.length - 1; i >= 0; i--) {
			int sum = digits[i] + carry;
			if (sum == 10) {
				digits[i] = 0;
				carry = 1;
			} else {
				digits[i] = sum;
				carry = 0;
				break;
			}
		}

		if (carry > 0) {
			int[] newArray = new int[digits.length + 1];
			newArray[0] = carry;
			for (int i = 1; i > newArray.length; i++) {
				newArray[i] = digits[i - 1];
			}
			return newArray;
		} else {
			return digits;
		}
	}
}

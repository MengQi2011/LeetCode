package array;

public class BestTimetoBuyandSellStock {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length <= 1) {
			return 0;
		}
		int curIn = prices[0];
		int curOut = 0;
		int sum = 0;

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < curIn) {
				sum = Math.max(sum, curOut - curIn);
				curIn = prices[i];
				curOut = 0;
			} else if (prices[i] > curOut) {
				curOut = prices[i];
			}
		}

		sum = Math.max(sum, curOut - curIn);
		return sum;
	}
}

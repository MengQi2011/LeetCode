package array;

public class BestTimetoBuyandSellStockII {
	public int maxProfit(int[] prices) {
		int profit = 0;
		int in = -1;

		for (int i = 0; i < prices.length - 1; i++) {
			if (in == -1) {
				if (prices[i] >= prices[i + 1]) {
					continue;
				} else {
					in = prices[i];
				}
			} else {
				if (prices[i] <= prices[i + 1]) {
					continue;
				} else {
					profit += prices[i] - in;
					in = -1;
				}
			}
		}

		if (in > -1) {
			profit += prices[prices.length - 1] - in;
		}

		return profit;
	}
}

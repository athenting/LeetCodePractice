package Solutions.Blind75;

public class MaxProfit2 {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int lowestBuy = Integer.MAX_VALUE;
        int tempProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < lowestBuy) {
                lowestBuy = prices[i];
            }
            tempProfit = prices[i] - lowestBuy;

            if (maxProfit < tempProfit) {
                maxProfit = tempProfit;
            }
        }

        return maxProfit;
    }
}

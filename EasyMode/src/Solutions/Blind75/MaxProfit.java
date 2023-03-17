package Solutions.Blind75;

/**
 * 暴力破解，超时了
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int tempInt = 0;

        for (int i = prices.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                tempInt = prices[i] - prices[j];
                if (tempInt > maxProfit) {
                    maxProfit = tempInt;
                }
            }
        }
        return maxProfit;
    }
}

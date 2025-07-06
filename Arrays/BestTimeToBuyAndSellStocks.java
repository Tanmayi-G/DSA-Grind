package Arrays;

public class BestTimeToBuyAndSellStocks {
    public int maxProfit(int[] prices) {
        int minOnTheLeft=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            minOnTheLeft=Math.min(minOnTheLeft,prices[i]);
            int profit=prices[i]-minOnTheLeft;
            maxProfit=Math.max(maxProfit,profit);
        }

        return maxProfit;
    }
}

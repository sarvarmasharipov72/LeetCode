public class Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] prices) {
        int minPrices = prices[0], maxPrices = 0;
        for (int i = 1; i< prices.length; i++){
            if (prices[i] <= minPrices){
                minPrices = prices[i];
            }else {
                maxPrices = Math.max(maxPrices, prices[i] - minPrices);
            }
        }
        return maxPrices;
    }
}

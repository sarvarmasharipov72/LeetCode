package DailyLeetCodingChallenge;

import java.util.Arrays;

public class BuyTwoChocolates {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int minCost = (prices[0] + prices[1]);
        return (money - minCost >= 0)? (money - minCost) : money;
    }
}

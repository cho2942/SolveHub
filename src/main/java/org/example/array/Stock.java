package org.example.array;

public class Stock {
    public static int maxProfit(int[] prices) {
        int lowPrice = Integer.MAX_VALUE;
        int profit = 0;

        for(int i=0; i<prices.length; i++) {
            if(prices[i] < lowPrice) {
                lowPrice = prices[i];
            }
            else if(prices[i] > lowPrice) {
                if(prices[i] - lowPrice > profit){
                    profit = prices[i] - lowPrice;
                }
            }
        }
        return profit;
    }

//    int sellOne = 0;
//    int holdOne = Integer.MIN_VALUE;
//
//    for (final int price : prices) {
//        sellOne = Math.max(sellOne, holdOne + price);
//        holdOne = Math.max(holdOne, -price);
//    }
//
//    return sellOne;
//}

//    Example 1:
//
//    Input: prices = [7,1,5,3,6,4]
//    Output: 5
//    Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//    Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

//    Example 2:
//
//    Input: prices = [7,6,4,3,1]
//    Output: 0
//    Explanation: In this case, no transactions are done and the max profit = 0.
//
//
//    Constraints:
//
//            1 <= prices.length <= 105
//            0 <= prices[i] <= 104
}

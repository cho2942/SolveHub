package org.example.dynamic;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int max = amount + 1; // 불가능한 큰 값
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;

        System.out.println(Arrays.toString(dp));
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount] == max ? -1 : dp[amount];
    }
}
//
//You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
//Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
//You may assume that you have an infinite number of each kind of coin.
//
//Example 1:
//
//Input: coins = [1,2,5], amount = 11
//Output: 3
//Explanation: 11 = 5 + 5 + 1

//Example 2:
//
//Input: coins = [2], amount = 3
//Output: -1

//Example 3:
//
//Input: coins = [1], amount = 0
//Output: 0
class Solution {
         //dynamic programming question - space coplexity N; 
        //time coplexity (N * M) amount and number of coins
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        //create dp int , amount + 1 (zero base)
        int[] dp = new int[amount + 1];
        //fill all with invalid
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int i = 0; i <= amount; i++) {
            //simulate taking all these diff coins
            for( int j = 0; j < coins.length; j++) {
                if(coins[j] <= i) {
                    //if we can take coin,set small as possible
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]); //makes whatever amount that is up in dp
                } else {
                    break; //no point to go thru bigger points
                }
            }
        }
        //check if we modified dp
        return dp[amount] > amount ? -1 : dp[amount];
    }
}
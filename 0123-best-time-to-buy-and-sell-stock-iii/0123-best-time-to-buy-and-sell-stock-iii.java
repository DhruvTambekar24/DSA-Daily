class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0){
            return 0;
        }
        int[][] dp=new int[3][2];
        for(int t=0;t<=2;t++){
            dp[t][0]=0;
            dp[t][1]=Integer.MIN_VALUE;
        }
        for(int i=0;i<n;i++){
            for(int t=2;t>=1;t--){
                dp[t][0]=Math.max(dp[t][0],dp[t][1]+prices[i]);
                dp[t][1]=Math.max(dp[t][1], dp[t-1][0]-prices[i]);
            }
        }
        return dp[2][0];
    }
}
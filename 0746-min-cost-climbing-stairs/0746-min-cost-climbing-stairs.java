class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        if(n==1){
            return cost[0];
        }
        if(n==2){
            return Math.min(cost[0],cost[1]);
        }
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int first=solve(cost,0,n,dp);
        int second=solve(cost,1,n,dp);
        return Math.min(first,second);
    }
    public int solve(int[] cost,int i,int n,int[] dp){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int one=cost[i]+solve(cost,i+1,n,dp);
        int two=cost[i]+solve(cost,i+2,n,dp);
        return dp[i]=Math.min(one,two);
    }
}
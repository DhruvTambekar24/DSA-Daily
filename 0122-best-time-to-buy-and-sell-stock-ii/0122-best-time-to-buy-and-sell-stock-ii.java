class Solution {
    public int maxProfit(int[] prices) {
        return solve(prices,0);
    }
    public int solve(int[] prices,int i){
        if(i==prices.length-1){
            return 0;
        }
        int p=0;
        if(prices[i+1]>prices[i]){
            p=prices[i+1]-prices[i];
        }
        return p+solve(prices,i+1);
    }
}
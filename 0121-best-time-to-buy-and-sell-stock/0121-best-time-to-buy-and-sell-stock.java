class Solution {
    public int maxProfit(int[] prices) {
       int min = prices[0];
       int maxProfit = 0;
       int n=prices.length;
       for(int i=0;i<n;i++){
        if(prices[i]<min){
            min=prices[i];
        }
        else{
            int profit=prices[i]-min;
            if(profit>maxProfit){
                maxProfit=profit;
            } 
        }
       }
       return maxProfit;
    }
}
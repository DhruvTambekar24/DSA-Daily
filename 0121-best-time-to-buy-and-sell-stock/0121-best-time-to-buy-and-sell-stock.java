class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min=prices[0];
        int max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int s=0;
        for(int i=0;i<n;i++){
           int p=prices[i]-min;
           max=Math.max(max,p);
           min=Math.min(min,prices[i]);
        }
        return max;
    }
}
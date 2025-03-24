class Solution {
    public int maxProfit(int[] prices) {
        int res = 0, k = prices[0];
        for (int i : prices) {
            res = Math.max(res, i - k);
            k = Math.min(k, i);
        }
        return res;
    }
}
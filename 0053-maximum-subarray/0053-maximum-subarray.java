class Solution {
    public int maxSubArray(int[] nums) {
     int mSum = nums[0];
     
      int sum = 0;
      int minSum = 0;
      for (int num : nums) {
        sum += num;
        mSum = Math.max(mSum, sum - minSum);
        minSum = Math.min(minSum, sum);
      }
      return mSum;
    }
}
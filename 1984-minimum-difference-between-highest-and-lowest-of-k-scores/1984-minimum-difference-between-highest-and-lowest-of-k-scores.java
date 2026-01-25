class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        int minDiff=Integer.MAX_VALUE;
        if(n==1) return 0;
        Arrays.sort(nums);
        for(int i=0;i+k-1<n;i++){
            int diff=nums[i+k-1]-nums[i];
            if(diff<=minDiff){
                minDiff=diff;
            }
        }
        return minDiff;
    }
}
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int sum=0;
        for(int i : nums){
            sum=sum+i;
        }
        int leftSum = 0;
        for(int i=0;i<n;i++){
            int rightSum=sum-leftSum-nums[i];
            res[i]=Math.abs(leftSum-rightSum);
            leftSum += nums[i];
        }
        return res;
    }
}
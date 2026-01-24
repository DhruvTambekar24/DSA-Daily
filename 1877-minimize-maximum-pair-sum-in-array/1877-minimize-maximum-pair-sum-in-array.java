class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxSum=0;
        int i=0;
        int j=n-1;
        while(i<=j){
            int sum=nums[i]+nums[j];
            if(sum>=maxSum) maxSum=sum;
            i++;
            j--;
        }
        return maxSum;
    }
}
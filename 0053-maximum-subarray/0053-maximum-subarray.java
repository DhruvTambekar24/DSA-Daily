class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int id=0;
        int max=nums[0];
        int sum=0;
        for(int i=0;i<n;i++){
           if(sum>=0){
             sum+=nums[i];
             max=Math.max(max,sum);
           }
           else{
             sum=nums[i];
             max=Math.max(max,sum);
           }
        }
        return max;
    }
}
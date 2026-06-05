class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
               sum=sum+nums[j];
               if(sum==goal){
                res++;
               }
            }
        }
        return res;
    }
}
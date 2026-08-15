class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int x=0;
        boolean check=false;
        for(int i=0;i<n;i++) {
            x ^= nums[i];
            if(nums[i]!=0){
                check=true;
            }
        }
        if(x!=0){
            return n;
        }
        if(check){
            return n-1;
        }
        return 0;
    }
}
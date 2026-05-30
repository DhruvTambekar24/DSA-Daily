class Solution {
    public int longestOnes(int[] nums, int k){
        int l=0;
        int r=0;
        int maxlen=0;
        int zeros=0;
        while(r<nums.length){
            int cnt=0;
            if(nums[r]==0){
               zeros++;
            }
            while(zeros>k){
                if(nums[l]==0)zeros--;
                l++;
            }
            if(zeros<=k){
                cnt=r-l+1;
                maxlen=Math.max(cnt,maxlen);
            }
            r++;
        }
        return maxlen;
    }
}
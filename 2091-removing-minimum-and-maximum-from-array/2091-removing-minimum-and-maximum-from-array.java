class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int minIdx=0;
        int maxIdx=0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[minIdx]){
                minIdx=i;
            }
            if (nums[i]>nums[maxIdx]){
                maxIdx=i;
            }
        }
        int l=Math.min(minIdx,maxIdx);
        int r=Math.max(minIdx,maxIdx);
        int ff=r+1;
        int fb=n-l;
        int bs=(l+1)+(n-r);
        return Math.min(ff, Math.min(fb,bs));
    }
}
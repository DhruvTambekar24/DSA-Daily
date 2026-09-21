class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] res=new long[k];
        long[] dp=new long[k];
        for(int i=0;i<nums.length;i++){
            long[] next=new long[k];
            int val=nums[i]%k;
            next[val]++;
            for(int j=0;j<k;j++){
                if(dp[j]>0){
                    int r=(j*val)%k;
                    next[r]+=dp[j];
                }
            }
            for(int j=0;j<k;j++){
                res[j]+=next[j];
            }
            dp=next;
        }
        return res;
    }
}
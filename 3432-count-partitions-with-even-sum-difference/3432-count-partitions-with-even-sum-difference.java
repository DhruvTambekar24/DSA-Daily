class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        if(n<2){
            return 0;
        }
        int tSum = 0;
        for(int num:nums){
            tSum += num;
        }
        if(tSum%2 ==0){
            return n-1;
        }
        int cnt=0;
        for(int i=0;i<n-1;i++){
            int lSum=0;
            for(int j = 0;j<=i;j++){
                lSum+=nums[j];
            }
            int rSum=0;
            for(int k=i+1;k<n;k++){
                rSum+=nums[k];
            }
            int diff=Math.abs(lSum-rSum);
            if(diff%2==0){
                cnt++;
            }
        }
        return cnt;
    }
}
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int first=solve(nums,0,n-1,dp1);
        int last=solve(nums,1,n,dp2);
        return Math.max(first,last);
    }
    public int solve(int[] arr,int i,int n,int[] dp){
        if(i>=n){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int get=arr[i]+solve(arr,i+2,n,dp);
        int left=solve(arr,i+1,n,dp);
        return dp[i]=Math.max(get,left);
    }
}
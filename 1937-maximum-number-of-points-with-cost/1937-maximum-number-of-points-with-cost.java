class Solution {
    public long maxPoints(int[][] points) {
        int m=points.length;
        int n=points[0].length;
        long[] dp=new long[n];
        for(int col=0;col<n;col++){
            dp[col]=points[0][col];
        }
        for(int row=1;row<m;row++){
            long[] left=new long[n];
            long[] right=new long[n];
            long[] newDp=new long[n];
            long leftMax=Long.MIN_VALUE;
            for(int col=0;col<n;col++){
                leftMax=Math.max(leftMax,dp[col]+col);
                left[col]=leftMax-col;
            }
            long rightMax=Long.MIN_VALUE;
            for(int col=n-1;col>=0;col--){
                rightMax=Math.max(rightMax,dp[col]-col);
                right[col]=rightMax+col;
            }
            for(int col=0;col<n;col++){
                newDp[col]=points[row][col]+ Math.max(left[col],right[col]);
            }
            dp=newDp;
        }
        long ans=Long.MIN_VALUE;
        for(int col=0;col<n;col++){
            ans=Math.max(ans,dp[col]);
        }
        return ans;
    }
}
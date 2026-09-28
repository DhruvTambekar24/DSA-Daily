class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        int min=Integer.MAX_VALUE;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        for(int col=0;col<n;col++){
            min=Math.min(min,solve(0,col,m,n,matrix,dp));
        }
        return min;
    }
    public int solve(int row,int col,int m,int n,int[][] matrix,int[][] dp){
        if(row==m-1){
            return matrix[row][col];
        }
        if(dp[row][col]!=Integer.MAX_VALUE){
            return dp[row][col];
        }
        int minSum=Integer.MAX_VALUE;
        if(col-1>=0){
            minSum=Math.min(minSum,solve(row+1,col-1,m,n,matrix,dp));
        }
        minSum=Math.min(minSum,solve(row+1,col,m,n,matrix,dp));
        if(col+1<n){
            minSum=Math.min(minSum,solve(row+1,col+1,m,n,matrix,dp));
        }
        return dp[row][col]=matrix[row][col]+minSum;

    }
}
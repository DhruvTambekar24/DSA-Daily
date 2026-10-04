class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int cnt=0;
        int[][] dp=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
               if(check(s,i,j,dp)){
                  cnt++;
               }
            }
        }
        return cnt;
    }
    public boolean check(String s,int i,int j,int[][]dp){
        if(i>=j){
            return true;
        }
        if(dp[i][j]!=-1){
            return dp[i][j]==1;
        }
        if(s.charAt(i)==s.charAt(j)){
            dp[i][j]=check(s,i+1,j-1,dp) ? 1:0;
            return dp[i][j]==1;
        }
        dp[i][j]=0;
        return false;
    }
}
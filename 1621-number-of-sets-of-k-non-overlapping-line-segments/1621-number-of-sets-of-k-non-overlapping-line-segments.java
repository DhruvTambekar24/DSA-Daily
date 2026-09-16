class Solution {
    public int numberOfSets(int n, int k) {
        int mod=1000000007;
        long[][] dp=new long[k+1][n];
        long[][] p=new long[k+1][n];
        for(int i=0;i<n;i++){
            dp[0][i]=1;
            p[0][i]=i+1;
        }
        for(int j=1;j<=k;j++){
            for(int i=1;i<n;i++){
                dp[j][i]=dp[j][i-1];
                dp[j][i]=(dp[j][i]+p[j-1][i-1])%mod;
                p[j][i]=(p[j][i-1]+dp[j][i])%mod;
            }
        }
        return (int)dp[k][n-1]; 
    }
}
class Solution {
    public int minimumChanges(String s, int k) {
        int n=s.length();
        int[][] cost=new int[n][n];
        for(int len=2;len<=n;len++){
            for(int l=0;l+len<=n;l++){
                int r=l+len-1;
                cost[l][r]=Integer.MAX_VALUE;
                for(int d=1;d<len;d++){
                    if(len%d!=0) continue;
                    int changes=0;
                    for(int i=0;i<d;i++){
                        int cnt=len/d;
                        for(int j=0;j<cnt/2;j++){
                            int a=l+i+j*d;
                            int b=l+i+(cnt-1-j)*d;
                            if(s.charAt(a)!=s.charAt(b)){
                                changes++;
                            }
                        }
                    }
                    cost[l][r]=Math.min(cost[l][r],changes);
                }
            }
        }
        int[][] dp=new int[k+1][n+1];
        for(int i=0;i<=k;i++){
            Arrays.fill(dp[i],1000000000);
        }
        dp[0][0]=0;
        for(int i=1;i<=k;i++){
            for(int j=2*i;j<=n;j++){
                for(int p=2*(i-1);p<=j-2;p++){
                    dp[i][j]=Math.min(
                        dp[i][j],
                        dp[i-1][p]+cost[p][j-1]
                    );
                }
            }
        }
        return dp[k][n];
    }
}
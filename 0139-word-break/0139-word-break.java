class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        Set<String> set=new HashSet<>(wordDict);
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return solve(s,0,n,set,dp);
    }
    public boolean solve(String s,int i,int n,Set<String> set,int[] dp){
        if(i==n){
            return true;
        }
        if(dp[i]!=-1){
            return dp[i]==1;
        }
        for(int j=i;j<n;j++){
            String word=s.substring(i,j+1);
            if(set.contains(word)){
                if(solve(s,j+1,n,set,dp)){
                    dp[i]=1;
                    return true;
                }
            }
        }
        dp[i]=0;
        return false;
    }
}
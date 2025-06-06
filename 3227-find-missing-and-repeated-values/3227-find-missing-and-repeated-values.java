class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       int[] ans = new int[2];
       int n = grid.length;
       int k = n*n;
       int[] cnt = new int[k+1];
       for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
         int m = grid[i][j];
         cnt[m]=cnt[m]+1;
        }
       }
       for(int i=1;i<=k;i++){
        if(cnt[i]==0){
            ans[1]=i;
        }
        if(cnt[i]==2){
            ans[0]=i;
        }
       }
       return ans;
    }
}
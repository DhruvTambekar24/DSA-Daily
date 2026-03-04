class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int c = mat[0].length;
        int[] rows = new int[n];
        int[] cols = new int[c];
        for(int i=0;i<n;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==1){
                    rows[i]++;
                    cols[j]++;
                }
            }
        }
        int res=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==1 && rows[i]==1 && cols[j]==1){
                    res++;
                }
            }
        }
        return res;
    }
}
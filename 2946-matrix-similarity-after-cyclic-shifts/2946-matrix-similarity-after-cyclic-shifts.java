class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int r = mat.length;
        int c = mat[0].length;
        int[][] org = new int[r][c];
        for(int i=0;i<r;i++){
           org[i] = mat[i].clone();
        }
        int rot =k%c;
        for(int i=0;i<r;i++){
            int[] temp = new int[c];
            for(int j=0;j<c;j++){
                if(i%2==0){
                    temp[j] =mat[i][(j+rot)%c];
                }else{
                    temp[j] = mat[i][(j-rot+c)%c];
                }
            }
            mat[i] = temp;
        }
        boolean areEqual=Arrays.deepEquals(mat,org);
        return areEqual;
    }
}
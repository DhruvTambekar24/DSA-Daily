class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int startIndex=n-1;
        int[][] res = new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              res[j][startIndex]=matrix[i][j];
            }
            startIndex--;
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              matrix[i][j]=res[i][j];
            }
        }
    }
}
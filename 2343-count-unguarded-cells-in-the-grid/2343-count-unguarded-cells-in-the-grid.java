class Solution {
    int res;

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] arr = new int[m][n];
         res = m * n;
        for(int[] g:guards){
            arr[g[0]][g[1]] = 1;
            res--;
        }
        for(int[] w:walls){
            arr[w[0]][w[1]] = 2;
            res--;
        }
        int[][] dirs = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        for(int[] g:guards){
            for(int[] dir : dirs){
                int newRow = g[0] + dir[0];
                int newCol = g[1] + dir[1];
                dfs(newRow, newCol, m, n, dir, arr);
            }
        }
        return res;
    }
    void dfs(int row, int col, int m, int n, int[] dir, int[][] arr){
        if(row < 0 ||row >= m ||col < 0 ||col >= n)return;
        if(arr[row][col] == 1 ||arr[row][col] == 2)return;
        if(arr[row][col] != 3) {
            arr[row][col] = 3;
            res--;
        }
        dfs(row + dir[0], col + dir[1], m, n, dir, arr);
    }
}

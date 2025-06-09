class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       int n = grid.length;
        long N = (long) n * n;
        long Sn = N * (N + 1) / 2;           
        long S2n = N * (N + 1) * (2 * N + 1) / 6;
        long S = 0;
        long S2 = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                long val = grid[i][j];
                S += val;
                S2 += val * val;
            }
        }
        long val1 = S - Sn;         
        long val2 = S2 - S2n;       
        long sumXY = val2 / val1;   
        long x = (val1 + sumXY) / 2;
        long y = x - val1;
        return new int[]{(int) x, (int) y};
    }
}
class Solution {
    public int minSwaps(int[][] grid){
     int n=grid.length;
        int count=0;
        for(int i=0;i<n;i++){
            int required=n-i-1;
            if (trailingZeros(grid[i]) >= required){
                continue;
            }
            int j=i+1;
            while(j<n && trailingZeros(grid[j])<required){
                j++;
            }
            if(j==n){
                return -1;
            }
            while (j>i) {
                int[] temp = grid[j];
                grid[j] = grid[j - 1];
                grid[j - 1] = temp;
                j--;
                count++;
            }
        }
        return count;
    }
    private int trailingZeros(int[] row) {
        int count = 0;
        for (int i =row.length-1;i>=0;i--) {
            if(row[i] == 0) count++;
            else break;
        }
        return count;
    }
}
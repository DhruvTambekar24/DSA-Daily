class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
       int n = grid.length;                 
        long N = 1L * n * n;                
        long S  = N * (N + 1) / 2;        
        long Q  = N * (N + 1) * (2 * N + 1) / 6; 
        long sum   = 0;                     
        long sqSum = 0;
        for (int[] row : grid) {
            for (int v : row) {
                sum   += v;
                sqSum += 1L * v * v;
            }
        }
        long diff   = sum   - S;            
        long diffSq = sqSum - Q;             
        long sumAB = diffSq / diff;         
        long a = (diff + sumAB) / 2;        
        long b = a - diff;                   
        return new int[] { (int) a, (int) b }; 
    }
}
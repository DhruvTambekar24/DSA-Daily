class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] ans = new int[m - k + 1][n - k + 1];
        for(int i = 0; i <= m - k; i++){
            for(int j = 0; j <= n - k; j++){
                List<Integer> s = new ArrayList<>();
                for(int l = i; l <= i + k - 1; l++){
                    for(int p = j; p <= j + k - 1; p++){
                        s.add(grid[l][p]);
                    }
                }
                Set<Integer> set = new HashSet<>(s);
                List<Integer> unique = new ArrayList<>(set);
                if(unique.size() == 1){
                    ans[i][j] = 0;
                    continue;
                }
                Collections.sort(unique);
                int min = Integer.MAX_VALUE;
                for(int x = 1; x < unique.size(); x++){
                    min = Math.min(min, unique.get(x) - unique.get(x - 1));
                }
                ans[i][j] = min;
            }
        }
        return ans;
       } 
    }

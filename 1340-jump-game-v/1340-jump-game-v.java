class Solution {
    int[] visited;
    public int maxJumps(int[] arr, int d) {
        int n = arr.length;
        visited = new int[n];
        for (int i = 0; i < n; i++) {
            visited[i] = -1;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, helper(arr, d, i));
        }
        return ans;
    }
    private int helper(int[] arr, int d, int i) {
        if (visited[i] != -1) {
            return visited[i];
        }
        int ans = 1;
        int j = i - 1;
        int x = d;
        while(j>=0 && arr[i]>arr[j] && x>0){
            ans = Math.max(ans, 1 + helper(arr, d, j));
            j--;
            x--;
        }
        j = i + 1;
        x = d;
        while(j < arr.length && arr[i]>arr[j] && x>0){
            ans = Math.max(ans,1+helper(arr,d,j));
            j++;
            x--;
        }
        visited[i] = ans;
        return ans;
    }
}
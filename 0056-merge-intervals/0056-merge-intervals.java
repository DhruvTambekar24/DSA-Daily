class Solution {
    public int[][] merge(int[][] intervals) {
        int r = intervals.length;
        if (r == 0) return new int[0][];
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int[][] res = new int[r][2];
        int idx = 0; 
        res[idx][0] = intervals[0][0];
        res[idx][1] = intervals[0][1];

        for(int i = 1; i < r; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (start <= res[idx][1]) {
                res[idx][1] = Math.max(res[idx][1], end);
            } else {
                idx++;
                res[idx][0] = start;
                res[idx][1] = end;
            }
        }
        return Arrays.copyOf(res, idx + 1);
    }
}
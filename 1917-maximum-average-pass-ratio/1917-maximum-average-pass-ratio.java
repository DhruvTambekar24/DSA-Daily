class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        int n = classes.length;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Double.compare(gain(b), gain(a))
        );
        for (int[] c : classes) {
            pq.offer(c);
        }
        for (int i = 0; i < extraStudents; i++) {
            int[] best = pq.poll();
            best[0] += 1; 
            best[1] += 1; 
            pq.offer(best);
        }
        double total = 0.0;
        for (int[] c : pq) {
            total += (double) c[0] / c[1];
        }

        return total / n;
    }
    private double gain(int[] c) {
        double p = c[0], t = c[1];
        return (p + 1) / (t + 1) - p / t;
    }
}

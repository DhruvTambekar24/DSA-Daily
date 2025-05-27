class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            int val = 1;
            for (int j = 0; j <= i; j++) {
                row.add(val);
                val = val * (i - j) / (j + 1);
            }
            pascal.add(row);
        }
        return pascal;
    }
}

class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> triangle = new ArrayList<>();
        for (int rowNum = 0; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i <= rowNum; i++) {
                if (i == 0 || i == rowNum) {
                    row.add(1);
                } else {
                    int val = triangle.get(rowNum - 1).get(i - 1) + triangle.get(rowNum - 1).get(i);
                    row.add(val);
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}
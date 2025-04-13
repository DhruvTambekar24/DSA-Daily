class Solution {
    public List<List<Integer>> permutations = new ArrayList<>();
    public List<Integer> currentPermutation = new ArrayList<>();
  
    private boolean[] visited;
    private int[] elements;
    public List<List<Integer>> permute(int[] nums) {
        elements = nums;
        visited = new boolean[nums.length];
        backtrack(0);
        return permutations;
    }
    public void backtrack(int index) {
        if (index == elements.length) {
            permutations.add(new ArrayList<>(currentPermutation));
            return;
        }
        for (int j = 0; j < elements.length; ++j) {
            if (!visited[j]) {
                visited[j] = true;
                currentPermutation.add(elements[j]);
                backtrack(index + 1);
                currentPermutation.remove(currentPermutation.size() - 1);
                visited[j] = false;
            }
        }
    }
}

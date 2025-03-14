class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> res = new HashMap<>();
        for (int i = 0;; ++i) {
            int x = nums[i];
            int y = target - x;
            if (res.containsKey(y)) {
                return new int[] {res.get(y), i};
            }
            res.put(x, i);
        }
    }
}
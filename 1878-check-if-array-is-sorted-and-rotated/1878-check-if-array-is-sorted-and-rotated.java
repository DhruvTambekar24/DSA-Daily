class Solution {
    public boolean check(int[] nums) {
      int n = nums.length;
        for (int r = 0; r < n; r++) {
            boolean isSorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    isSorted = false;
                    break;
                }
            }
            if (isSorted) return true;
            int temp = nums[0];
            for (int i = 1; i < n; i++) {
                nums[i - 1] = nums[i];
            }
            nums[n - 1] = temp;
        }
        return false;
    }
}
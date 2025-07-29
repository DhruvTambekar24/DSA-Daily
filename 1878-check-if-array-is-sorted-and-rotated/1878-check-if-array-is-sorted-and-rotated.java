class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int rotationPoint = -1;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (rotationPoint != -1) {
                    return false; 
                }
                rotationPoint = i + 1;
            }
        }
        if (rotationPoint == -1) return true;
        for (int i = rotationPoint; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) return false;
        }
        for (int i = 0; i < rotationPoint - 1; i++) {
            if (nums[i] > nums[i + 1]) return false;
        }
        if (nums[n - 1] > nums[0]) return false;

        return true;
    }
}

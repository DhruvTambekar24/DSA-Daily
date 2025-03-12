class Solution {
    public int missingNumber(int[] nums) {
       int size = nums.length;
        int n = size + 1;
        int miss = 0;
        for (int i = 0; i < n; i++) {
            boolean isMissing = true;
            for (int j = 0; j < size; j++) {
                if (i == nums[j]) { 
                    isMissing = false;
                    break;
                }
            }
            if (isMissing) {
                miss = i;
                break;
            }
        }
        return miss;
    }
}
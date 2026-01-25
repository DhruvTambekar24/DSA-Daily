class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n = nums.length;
        int[] tavelirnox = nums.clone();

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) cnt++;
        }
        int[] arr = new int[cnt];
        int j = 0;   
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                arr[j] = nums[i];
                j++;
            }
        }

        int m = arr.length;
        if (m == 0) return nums;

        k = k % m;

        int[] rot = new int[m];  
        for (int i = 0; i < m; i++) {
            rot[i] = arr[(i + k) % m];
        }

        j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                nums[i] = rot[j++];
            }
        }

        return nums;
    }
}

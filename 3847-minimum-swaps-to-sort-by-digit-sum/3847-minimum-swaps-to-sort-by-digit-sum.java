import java.util.*;
class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;

        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = i;
            arr[i][1] = getDigitSum(nums[i]);
            arr[i][2] = nums[i];
        }

        Arrays.sort(arr, (a, b) -> {
            if (a[1] != b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(a[2], b[2]);
        });

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i] || arr[i][0] == i)
                continue;

            int cSize = 0;
            int j = i;
            while (!visited[j]) {
                visited[j] = true;
                j = arr[j][0];
                cSize++;
            }

            if (cSize > 0)
                swaps += (cSize - 1);
        }

        return swaps;
    }

    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}


class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums, new int[nums.length], 0, nums.length - 1);
    }

    private int mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left >= right) return 0;
        
        int mid = (left + right) / 2;
        int count = mergeSort(arr, temp, left, mid);
        count += mergeSort(arr, temp, mid + 1, right);
        int j = mid + 1;
        for (int i = left; i <= mid; i++) {
            while (j <= right && (long) arr[i] > 2L * arr[j]) {
                j++;
            }
            count += (j - (mid + 1));
        }
        merge(arr, temp, left, mid, right);
        return count;
    }

    private void merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];

        for (int m = left; m <= right; m++) {
            arr[m] = temp[m];
        }
    }
}

class Solution {
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);  
        return i + 1;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int k = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                k = i;
                break;
            }
        }
        if (k == -1) {
            quickSort(nums, 0, n - 1);
            return;
        }
        int minIndex = -1;
        for (int j = n - 1; j > k; j--) {
            if (nums[j] > nums[k]) {
                minIndex = j;
                break;
            }
        }
        swap(nums, k, minIndex);
        quickSort(nums, k + 1, n - 1);
        
    }
}
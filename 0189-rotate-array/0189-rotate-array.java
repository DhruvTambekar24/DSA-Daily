class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int rot = k%n;
        int[] arr = new int[rot];
        int l=0;
        for(int i=n-rot;i<n;i++){
            arr[l]=nums[i];
            l++;
        }
        for(int i=n-1;i>=rot;i--){
            nums[i]=nums[i-rot];
        }
        int j=0;
        for(int i=0;i<rot;i++){
           nums[i]=arr[j];
           j++;
        }
    }
}
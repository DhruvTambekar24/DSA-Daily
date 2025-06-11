class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        return binarySearch(nums,target,low,high);
        
    }
    public int binarySearch(int[] nums , int target , int low , int high){
        if(low > high) return -1;
        int mid = (low+high)/2;
        if(target==nums[mid]) return mid;
        else if(target > nums[mid]){
            return binarySearch(nums,target,mid+1,high);
        } 
        else{
           return binarySearch(nums,target,low,mid-1);
        }
    }
}

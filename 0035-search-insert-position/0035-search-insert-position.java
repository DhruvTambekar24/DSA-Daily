class Solution {
  public int searchInsert(int[] nums, int target) {
    int n = nums.length;
    int low=0;
    int high=n-1;
    return binaryOp(nums,target,low,high);
  }
  public int binaryOp(int[] nums, int target,int low,int high){
    if(low>high) return low;
    int mid =(low+high)/2;
    if(nums[mid]==target){
        return mid;
    }
    else if(nums[mid]<target){
        return binaryOp(nums,target,mid+1,high);
    }
    else{
        return binaryOp(nums,target,low,mid-1);
    }
  }
}
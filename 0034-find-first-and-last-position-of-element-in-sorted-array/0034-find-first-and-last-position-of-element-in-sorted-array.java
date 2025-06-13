class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int n = nums.length;
        int low=0;
        int high=n-1;
        res[0]=firstPosition(nums,target,low,high);
        res[1]=lastPosition(nums,target,low,high);
        return res;
    }
    public int firstPosition(int[] nums, int target,int low,int high){
      int ans = -1;
      while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]==target){
            ans=mid;
            high=mid-1;
        }
        else if(nums[mid]<target){
           low=mid+1;
        }
        else{
            high=mid-1;
        }
      }
      return ans;
    }
    public int lastPosition(int[] nums, int target,int low,int high){
      int ans = -1;
      while(low<=high){
        int mid=(low+high)/2;
        if(nums[mid]==target){
            ans=mid;
            low=mid+1;
        }
        else if(nums[mid]<target){
           low=mid+1;
        }
        else{
            high=mid-1;
        }
      }
      return ans;
    }
}
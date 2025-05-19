class Solution {
    public String triangleType(int[] nums) {
       int n = nums.length;
       int k=nums[0];
       if(nums[1]==k && nums[2]==k){
        return "equilateral";
       }
       
       int m=0;
       if(nums[0]+nums[1] > nums[2] && nums[0]+nums[2]>nums[1] && nums[1]+nums[2] > nums[0]){
           m=1;
        }
        if(nums[0]==nums[1] || nums[0]==nums[2] || nums[1]==nums[2]){
            if(m==1){
               return "isosceles";
            } 
       }
       if(m==1){
        return "scalene";
       }

        else{
            return "none";
        }
       
    }
}
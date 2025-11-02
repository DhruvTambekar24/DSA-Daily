class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int s = 0;
        int e = n-1;
        int m = 0;
        while(m<=e){
            if(nums[m]==0){
                int temp = nums[s];
                nums[s]=nums[m];
                nums[m]=temp;
                s++;
                m++;
            }
            else if(nums[m]==2){
                int temp = nums[e];
                nums[e]=nums[m];
                nums[m]=temp;
                e--;
            }
            else{
                m++;
            }
        }
    }
}
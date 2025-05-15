class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] positive=new int[n];
        int[] negative=new int[n];
        int pcount=0;
        int ncount=0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0){
            positive[pcount]=nums[i];
            pcount++;
            }
            else{
              negative[ncount]=nums[i];
              ncount++;
            }
        }
        pcount=0;
        ncount=0;
        for(int i=0;i<n;i++){
           if(i%2==0){
            nums[i]=positive[pcount];
            pcount++;
           }
           else{
            nums[i]=negative[ncount];
            ncount++;
           }
        }
        return nums;
    }
}
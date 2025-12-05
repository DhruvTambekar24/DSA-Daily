class Solution {
    public int sumofres(int[] nums,int divisor){
        int sum=0;
        for(int i=0;i<nums.length;i++){
           int res=(int) Math.ceil((double)nums[i]/divisor);
           sum=sum+res;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Arrays.stream(nums).max().getAsInt();
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            int ressum=sumofres(nums,mid);
            if(ressum<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}
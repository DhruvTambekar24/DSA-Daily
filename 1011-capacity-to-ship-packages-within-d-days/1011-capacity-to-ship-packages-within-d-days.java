class Solution {
    public int checkCapacity(int[] weights, int capacity){
        int sum=0;
        int days=1;
        for(int i=0;i<weights.length;i++){
            if((sum+weights[i])>capacity){
                days++;
                sum=weights[i];
            }
            else{
                sum=sum+weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
           int low=Arrays.stream(weights).max().getAsInt();;
           int high=Arrays.stream(weights).sum();
           int ans=high;
           while(low<=high){
            int mid=(low+high)/2;
            int resdays=checkCapacity(weights,mid);
            if(resdays<=days){
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
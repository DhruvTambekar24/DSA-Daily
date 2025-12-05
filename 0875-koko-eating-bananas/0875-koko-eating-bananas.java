class Solution {
    public long totalHours(int[] piles , int k){
        long th=0;
        for(int i=0;i<piles.length;i++){
            th=th+(piles[i] + k - 1)/k;
        }
        return th;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low=1;
        int high=Arrays.stream(piles).max().getAsInt();;
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            long hours=totalHours(piles,mid);
            if(hours<=h){
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
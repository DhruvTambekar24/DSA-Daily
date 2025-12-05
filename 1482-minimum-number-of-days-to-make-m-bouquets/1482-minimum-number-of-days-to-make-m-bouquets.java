class Solution {
    public int noofBouquets(int[] bloomDay,int k,int days){
        int cnt=0;
        int res=0;
        for(int i=0;i<bloomDay.length;i++){
           if(bloomDay[i]<=days){
             cnt++;
             if(cnt==k){
                res++;
                cnt=0;
             }
           }
           else{
            cnt=0;
           }
        }
        return res;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long req = (long)m*k;
        if(req > bloomDay.length) return -1;
        int low=Arrays.stream(bloomDay).min().getAsInt();
        int high=Arrays.stream(bloomDay).max().getAsInt();
        int ans=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int noofboq=noofBouquets(bloomDay,k,mid);
            if(noofboq>=m){
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
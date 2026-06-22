class Solution {
    public int maxTotalValue(int[] value, int[] decay, int m) {
        int n=value.length;
        long mod=1000000007;
        long low=1,high=1000000000;
        while(low<high){
            long mid=(low+high+1)/2;
            long count=0;
            for(int i=0;i<n;i++){
                if(value[i]>=mid){
                    count+=(value[i]-mid)/decay[i]+1;
                }
            }
            if(count>=m){
                low=mid;
            }else{
                high=mid-1;
            }
        }
        long T=low;
        long totalCount=0;
        long res=0;
        for(int i=0;i<n;i++){
            if(value[i]>=T){
                long k=(value[i]-T)/decay[i]+1;
                totalCount+=k; 
                long sum=k*(2L*value[i]-(k-1)*decay[i])/2;
                res=(res+sum%mod)%mod;
            }
        }
        if(totalCount>m){
            res=(res-((totalCount-m)%mod)*(T%mod)%mod+mod)%mod;
        }
        return (int)res;
    }
}
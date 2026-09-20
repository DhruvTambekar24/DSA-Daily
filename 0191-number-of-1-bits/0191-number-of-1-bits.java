class Solution {
    public int hammingWeight(int n) {
        int cnt=0;
        int t=n;
        while(n!=0){
            cnt++;
            n=n>>1;
        }
        int res=0;
        for(int i=0;i<cnt;i++){
           if(((t>>i)& 1)==1){
            res++;
           }
        }
        return res;
    }
}
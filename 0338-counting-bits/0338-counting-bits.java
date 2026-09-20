class Solution {
    public int[] countBits(int n) {
        int[] res=new int[n+1];
        res[0]=0;
        for(int i=1;i<=n;i++){
            int cnt=0;
            int idx=i;
            while(idx>0){
                idx=idx&idx-1;
                cnt++;
            }
            res[i]=cnt;
        }
        return res;
    }
}
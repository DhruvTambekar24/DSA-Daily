class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        int res=0;
        int sum=0;
        for(int i=0;i<=n+k;i++){
            if(Math.abs(n-i)<=k && (n&i)==0){
                res++;
                sum=sum+i;
            }
        }
        return sum;
    }
}
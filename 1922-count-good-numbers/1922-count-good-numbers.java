class Solution {
    static final long MOD = 1000000007;
    public int countGoodNumbers(long n) {
        long odd = n/2;
        long even = (n+1)/2;
        long res1 = myPow(5,even);
        long res2 = myPow(4,odd);
        return (int)((res1*res2)%MOD);
    }
    public long myPow(long x, long n) {
        return res(x%MOD,n);
    }
    private long res(long x,long n) {
        if(n==0) return 1;
        long half = res(x,n/2);
        if(n%2 != 0){
            return (x*half%MOD * half%MOD)%MOD;
        } else{
            return (half*half)%MOD;
        }
    }
}
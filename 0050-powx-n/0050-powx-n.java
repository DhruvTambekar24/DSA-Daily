class Solution {
    public double myPow(double x, int n) {
        long low = n;
        if(low<0){
            x=1/x;
            low=-low;
        }
        return res(x,low);
    }
    private double res(double x,long n) {
        if(n==0) return 1;
        
        if(n%2 !=0){
            return x * res(x*x,n/2);
        }else{
            return res(x*x,n/2);
        }
    }
}
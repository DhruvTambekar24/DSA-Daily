class Solution {
    public int maxLength(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n;i++){
            long prod=1;
            int gcd=0;
            long lcm=1;
            for(int j=i;j<n;j++){
                int num=nums[j];
                prod*=num;
                gcd=findGcd(gcd,num);
                lcm=(lcm*num)/findGcd((int)lcm,num);
                if(prod==lcm*gcd){
                    res=Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
    int findGcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
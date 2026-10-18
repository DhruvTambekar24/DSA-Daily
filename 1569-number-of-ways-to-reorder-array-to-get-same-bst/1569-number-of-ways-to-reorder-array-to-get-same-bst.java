class Solution {
    int mod=1000000007;
    long[][] comb=new long[1001][1001];
    public int numOfWays(int[] nums) {
        for(int i=0;i<=nums.length;i++){
            comb[i][0]=comb[i][i]=1;
            for(int j=1;j<i;j++){
                comb[i][j]=(comb[i-1][j-1]+comb[i-1][j])%mod;
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int num:nums) list.add(num);
        return (int)((solve(list)-1+mod)%mod);
    }
    long solve(List<Integer> nums) {
        int n=nums.size();
        if(n<=2) return 1;
        int root=nums.get(0);
        List<Integer> left=new ArrayList<>();
        List<Integer> right=new ArrayList<>();
        for(int i=1;i<n;i++){
            if(nums.get(i)<root) left.add(nums.get(i));
            else right.add(nums.get(i));
        }
        long l=solve(left);
        long r=solve(right);
        return (((comb[n-1][left.size()]*l)%mod)*r)%mod;
    }
}
class Solution {
    public int concatenatedBinary(int n) {
        StringBuilder b = new StringBuilder();
        for(int i=1;i<=n;i++){
            String t = Integer.toBinaryString(i);
            b.append(t);
        }
        long result = 0;
        int mod = 1000000007;
        for(int i=0;i<b.length();i++){
            result=(result * 2 + (b.charAt(i) - '0'))%mod;
        }
        return (int) result;
    }
}
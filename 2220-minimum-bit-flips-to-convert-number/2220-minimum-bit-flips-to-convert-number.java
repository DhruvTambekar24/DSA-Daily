class Solution {
    public int minBitFlips(int start, int goal) {
        int res = start ^ goal;
        int cnt=0;
        for(int i=0;i<31;i++){
            cnt = cnt+(res & 1);
            res = res >> 1;
        }
        return cnt;
    }
}
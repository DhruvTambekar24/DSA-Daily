class Solution {
    public int totalMoney(int n) {
        int w = n / 7;
        int d = n % 7;
        int res = 0;
        res= res + w* 28 + 7 *(w*(w - 1))/2;
        int start = w + 1;
        for(int i = 0; i < d; i++){
            res=res + start + i;
        }
        return res; 
    }
}
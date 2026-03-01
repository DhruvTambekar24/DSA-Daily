class Solution {
    public int numberOfSubstrings(String s) {
        int lastA = -1;
        int lastB = -1;
        int lastC = -1;
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a') lastA = i;
            if(ch == 'b') lastB = i;
            if(ch == 'c') lastC = i;
            int minIndex = Math.min(lastA, Math.min(lastB, lastC));
            if(minIndex != -1){
                res += minIndex + 1;
            }
        }
        return res;
    }
}
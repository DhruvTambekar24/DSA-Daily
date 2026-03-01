class Solution {
    public int maxDepth(String s) {
        int cnt =0;
        int res=0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
               cnt++;
               res = Math.max(res, cnt);
            }
            if(c==')'){
              cnt--;
            }
        }
        return res;
    }
}
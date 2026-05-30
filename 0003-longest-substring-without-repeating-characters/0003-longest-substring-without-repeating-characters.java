class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            String t = "";
            for(int j=i;j<s.length();j++){
               char c = s.charAt(j);
               if(!t.contains(String.valueOf(c))){
                 t=t+c;
                 max = Math.max(max,t.length());
               }
               else{
                 break;
               }
            }
        }
        return max;
    }
}
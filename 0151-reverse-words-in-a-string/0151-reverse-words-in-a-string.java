class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int ilc=s.length();
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
               for(int j=i+1;j<ilc;j++){
                res.append(s.charAt(j));
               }
               if(i+1<ilc) res.append(' ');
               ilc=i;
            }
        }
        for(int j=0;j<ilc;j++){
            res.append(s.charAt(j));
        }
        return res.toString().trim();
    }
}
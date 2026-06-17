class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c>='a'  && c<='z'){
                sb.append(c);
            }
            if(c=='*'){
                int le=sb.length();
                if(le>0){
                  sb.deleteCharAt(le-1);
                }
            }
            if(c=='#'){
                String s1=sb.toString();
                sb.append(s1);
            }
            if(c=='%'){
                sb.reverse();
            }
        }
        return sb.toString();
    }
}
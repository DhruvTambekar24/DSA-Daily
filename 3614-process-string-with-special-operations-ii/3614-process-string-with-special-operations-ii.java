class Solution {
    public char processStr(String s, long k) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        long len=0;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z'){
                len++;
            }else if(c=='*'){
                if(len>0) len--;
            }else if(c=='#'){
                len*=2;
            }
        }
        if (k >= len) return '.';
        for(int i=n-1;i>=0;i--){
            char c=s.charAt(i);
            if(c=='%'){
                 k=len-1-k;
            }else if(c=='#'){
                len/=2;
                if(k>=len){
                    k-=len;
                }
            }else if(c=='*'){
                len++;
            }
            else{
                if(k==len-1){
                    return c;
                }
                len--;
            }
        }
        return '.';
    }
}
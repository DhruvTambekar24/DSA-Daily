class Solution {
    public boolean checkPalindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n = s.length();
        int max = 0;
        int ss = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(checkPalindrome(s,i,j)){
                    int cur = j - i + 1;
                    if(cur>max){
                        max = cur;
                        ss = i;
                    }
                }
            }
        }
        return s.substring(ss,ss+max);
    }
}
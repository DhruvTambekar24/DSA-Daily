class Solution {
    public boolean checkString(String s) {
        int ctr=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='b'){
                ctr=1;
            }
            if(ctr==1){
                if(s.charAt(i)=='a'){
                return false;
            }
            }
        }
        return true;
    }
}
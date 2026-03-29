class Solution {
    public int myAtoi(String s) {
        if(s==null) return 0;
        s = s.trim();
        if(s.length()==0) return 0;
        int sign = 1;
        int i = 0;
        if(s.charAt(0) == '-'){
            sign=-1;
            i++;
        } else if(s.charAt(0) == '+'){
            i++;
        }
        return helper(s,i,0,sign);
    }
    private int helper(String s,int i,long num,int sign){
        if(i>=s.length()){
            return (int)(sign*num);
        }
        char c=s.charAt(i);
        if (!Character.isDigit(c)) {
            return (int)(sign*num);
        }
        int digit =c-'0';
        num = num*10+digit;
        if(sign==1 && num>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(sign ==-1 && -num<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return helper(s,i+1,num,sign);
    }
}
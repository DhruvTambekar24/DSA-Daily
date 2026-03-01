class Solution {
    public int myAtoi(String s) {
        if(s==null)return 0;
        s = s.trim();
        if(s.length()==0)return 0;
        int neg=0;
        int i=0;
        long num=0;   
        if(s.charAt(0)=='-'){
            neg=1;
            i++;
        } 
        else if(s.charAt(0)=='+'){
            i++;
        }
        for(;i<s.length();i++){
            char c = s.charAt(i);
            if(!Character.isDigit(c)){
                break;
            }
            int digit=c - '0';
            num=num*10+digit;
            if(neg == 0 && num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if(neg == 1 && -num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        if(neg==1)
            num = -num;
        return (int) num;
    }
}
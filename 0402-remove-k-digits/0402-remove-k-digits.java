class Solution {
    public String removeKdigits(String num, int k) {
        int n=num.length();
        Stack<Character> stk=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && k>0 && ((stk.peek()-'0')>(num.charAt(i)-'0'))){
                stk.pop();
                k--;
            }
            stk.push(num.charAt(i));
        }
        while(k>0){
            stk.pop();
            k--;
        }
        if(stk.isEmpty()) return "0";
        StringBuilder sb = new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        sb.reverse();
        while(sb.length() > 1 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
}
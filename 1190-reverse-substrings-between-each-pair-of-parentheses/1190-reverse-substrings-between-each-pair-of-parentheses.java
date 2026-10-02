class Solution {
    public String reverseParentheses(String s) {
        Stack<String> stack=new Stack<>();
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                stack.push(str);
                str="";
            }else if(ch==')'){
                str=new StringBuilder(str).reverse().toString();
                str=stack.pop()+str;
            }else{
                str+=ch;
            }
        }
        return str;
    }
}
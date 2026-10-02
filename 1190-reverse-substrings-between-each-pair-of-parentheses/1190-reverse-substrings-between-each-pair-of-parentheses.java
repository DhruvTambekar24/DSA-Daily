class Solution {
    public String reverseParentheses(String s) {
        int n=s.length();
        int[] pair=new int[n];
        int[] stack=new int[n];
        int top=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                stack[++top]=i;
            }else if(s.charAt(i)==')'){
                int j=stack[top--];
                pair[i]=j;
                pair[j]=i;
            }
        }
        StringBuilder res=new StringBuilder();
        int i=0;
        int dir=1;
        while(i<n){
            if(s.charAt(i)=='(' || s.charAt(i)==')'){
                i=pair[i];
                dir=-dir;
            }else{
                res.append(s.charAt(i));
            }

            i+=dir;
        }
        return res.toString();
    }
}
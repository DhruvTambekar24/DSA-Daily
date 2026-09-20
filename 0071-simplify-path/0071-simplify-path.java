class Solution {
    public String simplifyPath(String path) {
        String[] arr=path.split("/");
        String res="";
        int n=arr.length;
        Stack<String> stk=new Stack<>();
        for(int i=0;i<n;i++){
            if(arr[i].equals("") || arr[i].equals(".")){
                continue;
            }
            else if(arr[i].equals("..")){
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }
            else{
                stk.push(arr[i]);
            }
        }
        while(!stk.isEmpty()){
            res="/"+stk.pop()+res;
        }
        if(res.equals("")){
           return "/";
        }
        return res;
    }
}
class Solution {
    public List<String> validStrings(int n) {
       List<String> res=new ArrayList<>();
        solve(n,0,"",res);
        return res; 
    }
    public void solve(int n,int i,String str,List<String> res){
        if(i==n){
            res.add(str);
            return;
        }
        solve(n,i+1,str+"1",res);
        if(i==0 ||str.charAt(i-1)!='0'){
            solve(n,i+1,str+"0",res);
        }
    }
}
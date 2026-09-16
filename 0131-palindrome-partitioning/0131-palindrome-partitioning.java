class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> list=new ArrayList<>();
        solve(s,0,list,res);
        return res;
    }
    public void solve(String s,int i,List<String> list,List<List<String>> res){
        if(i==s.length()){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int j=i;j<s.length();j++){
            if(isPalindrome(s,i,j)){
                list.add(s.substring(i,j+1));
                solve(s,j+1,list,res);
                list.remove(list.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
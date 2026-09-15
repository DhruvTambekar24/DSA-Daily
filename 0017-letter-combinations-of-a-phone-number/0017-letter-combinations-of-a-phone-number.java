class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        solve(digits,0,"",map,res);
        return res;
    }
    public void solve(String digits,int i,String str,String[] map,List<String> res){
        if(i==digits.length()){
            res.add(str);
            return;
        }
        String temp=map[digits.charAt(i)-'0'];
        for(int j=0;j<temp.length();j++){
            solve(digits,i+1,str+temp.charAt(j),map,res);
        }
    }
}
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits.length()==0){
            return res;
        }
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        res.add("");
        for(int i=0;i<digits.length();i++){
            String letters=map[digits.charAt(i)-'0'];
            List<String> temp=new ArrayList<>();
            for(String str:res){
                for(int j=0;j<letters.length();j++){
                    temp.add(str+letters.charAt(j));
                }
            }
            res=temp;
        }
        return res;
    }
}
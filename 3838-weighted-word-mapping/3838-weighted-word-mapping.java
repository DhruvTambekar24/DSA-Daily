class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res=new StringBuilder();
        for(String s:words){
            int sum=0;
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                sum=sum+weights[ch-'a'];
            }
            sum=sum%26;
            char result=(char)('z'-sum);
            res.append(result);
        }
        return res.toString();
    }
}
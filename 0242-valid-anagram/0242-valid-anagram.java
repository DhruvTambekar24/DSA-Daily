class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c, 0)+1);
        }    
        boolean res = true;
        for(int j=0;j<t.length();j++){
            char c1 = t.charAt(j);
            if(!map.containsKey(c1)){
                return false;
            }
            map.put(c1, map.get(c1)-1);
            if(map.get(c1)<0){
                return false;
            }
        }
        return res;
    }
}
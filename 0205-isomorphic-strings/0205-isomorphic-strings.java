class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> m1 = new HashMap<>();
        HashMap<Character, Character> m2 = new HashMap<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            char first = s.charAt(i);
            char sec = t.charAt(i);
            if(m1.containsKey(first)){
                if(m1.get(first)!=sec){
                    return false;
                }
            }else{
                m1.put(first,sec);
            }
            if(m2.containsKey(sec)){
                if(m2.get(sec)!=first){
                    return false;
                }
            }else{
                m2.put(sec,first);
            }
        }
        return true;
    }
}
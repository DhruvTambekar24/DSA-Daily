class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> lower = new HashSet<>();
        Set<Character> upper = new HashSet<>();
        Set<Character> invalid = new HashSet<>();
        for(char c : word.toCharArray()){
            if(Character.isLowerCase(c)){
                if(upper.contains(c)){
                    invalid.add(c);
                }
                lower.add(c);
            }else{
                char lc = Character.toLowerCase(c);
                if(!lower.contains(lc)){
                }
                upper.add(lc);
            }
        }
        int count = 0;
        for(char c : lower){
            if(upper.contains(c) && !invalid.contains(c)){
                count++;
            }
        }
        return count;
    }
}
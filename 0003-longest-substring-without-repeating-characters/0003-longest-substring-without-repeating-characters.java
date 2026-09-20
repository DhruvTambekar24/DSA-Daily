class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int l=0;
        int max=0;
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            while(map.containsKey(c)){
                map.remove(s.charAt(l));
                l++;
            }
            map.put(c,r);
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}
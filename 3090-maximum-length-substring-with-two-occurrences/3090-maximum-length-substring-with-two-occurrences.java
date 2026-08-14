class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int n=s.length();
        int max=0;
        int l=0;
        for(int r=0;r<n;r++){
            int cnt=map.getOrDefault(s.charAt(r),0)+1;
            map.put(s.charAt(r),cnt);
            while(map.get(s.charAt(r))>2){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}
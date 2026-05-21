class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            String st = Integer.toString(arr1[i]);
            String prefix="";
            for(int j=0;j<st.length();j++){
                prefix=prefix+st.charAt(j);
                set.add(prefix);
            }
        }
        int maxcnt=0;
        for(int i=0;i<arr2.length;i++){
            String s = Integer.toString(arr2[i]);
            String prefix="";
            for(int j=0;j<s.length();j++){
                prefix=prefix+s.charAt(j);
                if(set.contains(prefix)){
                    maxcnt=Math.max(maxcnt,prefix.length());
                }else{
                    break;
                }
            }
        }
        return maxcnt;
    }
}
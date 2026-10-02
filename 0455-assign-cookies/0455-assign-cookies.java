class Solution {
    public int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g);
       Arrays.sort(s);
       int i=0;
       int j=0;
       int n=g.length;
       int n1=s.length;
       int res=0;
       while(i<n && j<n1){
            if(g[i]<=s[j]){
                res++;
                i++;
            }
            j++;
       } 
       return res;
    }
}
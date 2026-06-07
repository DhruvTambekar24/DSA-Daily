class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        int n2 =t.length();
        int n1=s.length();
        for(int i=0;i<n2;i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int min=Integer.MAX_VALUE;
        int idx=-1;
        int r=0;
        int l=0;
        int cnt=0;
        while(r<n1){
            char c=s.charAt(r);
            if(map.containsKey(c)){
              if(map.get(c)>0) cnt++;
              map.put(c,map.getOrDefault(c,0)-1);
            }
            while(cnt==n2){
                if(r-l+1<min){
                    min=r-l+1;
                    idx=l;
                }
                char left=s.charAt(l);
                if(map.containsKey(left)){
                    map.put(left,map.get(left)+1);
                    if(map.get(left)>0) cnt--;
                }
                l++;
            }
            r=r+1;
        }
        return idx == -1 ? "" : s.substring(idx,idx+min);
    }
}
class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n=s.length();
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                arr.add(i);
            }
        }
        if(s.charAt(n-1)!='0'){
           return false;
        } 
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        boolean[] visited = new boolean[n];
        visited[0] = true;
        int ptr = 0;
        while(!q.isEmpty()){
            int ele=q.poll();
            if(ele==n-1) return true;
            for(int i=ptr;i<arr.size();i++){
                int next=arr.get(i);
                if(next<ele+minJump) continue;
                if(next>ele+maxJump) break;
                if(!visited[next]){
                    visited[next]=true;
                    q.add(next);
                }
                ptr=i+1;
            }
        }
        return false;
    }
}
class Solution {
    int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m=grid.size();
        int n=grid.get(0).size();
        int[][] best=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(best[i],-1);
        }
        Queue<int[]> q=new LinkedList<>();
        int start=health-grid.get(0).get(0);
        if(start<=0) return false;
        q.offer(new int[]{0,0,start});
        best[0][0]=start;
        while(!q.isEmpty()){
            int[] curr=q.poll();

            int x=curr[0];
            int y=curr[1];
            int h=curr[2];
            if(x==m-1 && y==n-1){
                return true;
            }
            for(int[] d:dir){
                int nx=x+d[0];
                int ny=y+d[1];
                if(nx>=0 && ny>=0 && nx<m && ny<n){
                    int nh=h-grid.get(nx).get(ny);

                    if(nh>0 && nh>best[nx][ny]){
                        best[nx][ny]=nh;
                        q.offer(new int[]{nx,ny,nh});
                    }
                }
            }
        }
        return false;
    }
}
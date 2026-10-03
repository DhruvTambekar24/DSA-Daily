class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1], b[1]));
        //[1,6] [2,8] [7,12] [10,16]
        int prev=points[0][1];
        int res=1;
        int n=points.length;
        for(int i=1;i<n;i++){
            if(points[i][0]>prev){
                res++;
                prev=points[i][1];
            }
        }
        return res;
    }
}
class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[][] psum=new int[n][m];
        for(int j=0;j<m;j++){
            int sum=0;
            for(int i=0;i<n;i++){
               if(matrix[i][j]=='1') sum++;
               else{
                  sum=0;
               }
               psum[i][j]=sum;
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,lhist(psum[i]));
        }
        return max;
    }
    public int lhist(int[] heights){
       int n=heights.length;
       int[] ple=new int[n];
       int[] nle=new int[n];
       int max=0;
       Stack<Integer> stk=new Stack<>();
       for(int i=0;i<n;i++){
          while(!stk.isEmpty() && heights[stk.peek()]>heights[i]){
              stk.pop();
          }
          ple[i]=stk.isEmpty() ? -1 : stk.peek();
          stk.push(i);
       }
       stk.clear();
       for(int i=n-1;i>=0;i--){
          while(!stk.isEmpty() && heights[stk.peek()]>=heights[i]){
            stk.pop();
          }
          nle[i]=stk.isEmpty() ? n : stk.peek();
          stk.push(i);
       }
       for(int i=0;i<n;i++){
          max=Math.max(max,heights[i]*(nle[i]-ple[i]-1));
       }
       return max;
    }
}
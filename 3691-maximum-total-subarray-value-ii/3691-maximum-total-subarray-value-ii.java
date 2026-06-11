import java.util.*;
class Solution{
    public long maxTotalValue(int[] nums,int k){
        int n=nums.length;
        SparseTable LUT=new SparseTable(nums);
        PriorityQueue<long[]> pq=new PriorityQueue<>((a,b)->Long.compare(a[0],b[0]));
        for(int i=0;i<n;i++){
            pq.offer(new long[]{-LUT.query(i,n),i,n});
        }
        long res=0;
        for(int i=0;i<k;i++){
            long[] top=pq.peek();
            long val=top[0];
            int l=(int)top[1];
            int r=(int)top[2];
            if(val==0) break;
            res-=val;
            pq.poll();
            pq.offer(new long[]{-LUT.query(l,r-1),l,r-1});
        }
        return res;
    }
}

class SparseTable{
    int[][] Min,Max;
    public SparseTable(int[] num){
        int n=num.length;
        int bitWidth=32-Integer.numberOfLeadingZeros(n);
        Min=new int[bitWidth][n];
        Max=new int[bitWidth][n];
        for(int i=0;i<n;i++){
            Min[0][i]=num[i];
            Max[0][i]=num[i];
        }
        for(int i=1;i<bitWidth;i++){
            for(int j=0;j+(1<<i)<=n;j++){
                Min[i][j]=Math.min(Min[i-1][j],Min[i-1][j+(1<<(i-1))]);
                Max[i][j]=Math.max(Max[i-1][j],Max[i-1][j+(1<<(i-1))]);
            }
        }
    }
    public int query(int l,int r){
        int len=r-l;
        int k=31-Integer.numberOfLeadingZeros(len);
        int mx=Math.max(Max[k][l],Max[k][r-(1<<k)]);
        int mn=Math.min(Min[k][l],Min[k][r-(1<<k)]);
        return mx-mn;
    }
}
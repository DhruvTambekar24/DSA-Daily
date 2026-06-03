class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
     int[] waterStartTime, int[] waterDuration) {

        int ans=Integer.MAX_VALUE;
        ans=Math.min(ans, solve(landStartTime,landDuration,waterStartTime,waterDuration));
        ans=Math.min(ans, solve(waterStartTime,waterDuration,landStartTime,landDuration));
        return ans;
    }
    private int solve(int[] Astart,int[] Adur,int[] Bstart,int[] Bdur){
        int n = Bstart.length;
        int[][] B = new int[n][2];
        for(int i=0;i<n;i++){
            B[i][0] = Bstart[i];
            B[i][1] = Bdur[i];
        }
        Arrays.sort(B,Comparator.comparingInt(a ->a[0]));
        int[] suffixMin = new int[n];
        suffixMin[n-1] = B[n-1][0] + B[n-1][1];
        for(int i=n-2;i>=0;i--){
            suffixMin[i] = Math.min(suffixMin[i+1],B[i][0] + B[i][1]);
        }
        int[] prefixMinDur = new int[n];
        prefixMinDur[0] = B[0][1];
        for(int i=1;i<n;i++){
            prefixMinDur[i] = Math.min(prefixMinDur[i-1],B[i][1]);
        }
        int res=Integer.MAX_VALUE;
        for(int i=0;i<Astart.length;i++){
            int finish = Astart[i]+Adur[i];
            int idx = lowerBound(B,finish);
            if(idx<n){
                res = Math.min(res,suffixMin[idx]);
            }
            if(idx>0){
                res = Math.min(res,finish+prefixMinDur[idx-1]);
            }
        }
        return res;
    }

    private int lowerBound(int[][] arr, int target){
        int l = 0;
        int r=arr.length;
        while(l<r){
            int mid =(l+r)/2;
            if (arr[mid][0] >= target) r=mid;
            else l = mid+1;
        }
        return l;
    }
}
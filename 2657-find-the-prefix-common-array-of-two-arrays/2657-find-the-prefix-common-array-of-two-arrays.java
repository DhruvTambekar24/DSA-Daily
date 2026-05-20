class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] res = new int[n];
        int[] cnt = new int[n+1];
        int same=0;
        for(int i=0;i<n;i++){
            cnt[A[i]]++;
            if(cnt[A[i]]==2)same++;
            cnt[B[i]]++;
            if (cnt[B[i]]==2)same++;
            res[i]=same;
        }
        return res;
    }
}
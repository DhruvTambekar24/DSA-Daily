class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long k=(long)k1+k2;
        int[] freq=new int[100001];
        int max=0;
        for(int i=0;i<nums1.length;i++){
            int d=Math.abs(nums1[i]-nums2[i]);
            freq[d]++;
            max=Math.max(max,d);
        }
        for(int i=max;i>0 && k>0;i--){
            if(freq[i]==0){
                continue;
            }
            long count=freq[i];
            long move=Math.min(k,count);
            freq[i]-=(int)move;
            freq[i-1]+=(int)move;
            k-=move;
            if(move<count){
                break;
            }
        }
        long ans=0;
        for(int i=1;i<=max;i++){
            ans+=(long)i*i*freq[i];
        }
        return ans;
    }
}
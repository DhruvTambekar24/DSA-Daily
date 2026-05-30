class Solution {
    public int longestOnes(int[] nums, int k){
        int maxcnt=0;
        int n =nums.length;
        for(int i=0;i<n;i++){
            int cnt=0;
            int f=k;
            for(int j=i;j<n;j++){
                if(nums[j]==1){
                    cnt++;
                }else{
                    if(f!=0){
                        f--;
                        cnt++;
                    }
                    else{
                        break;
                    }
                }
                maxcnt=Math.max(maxcnt,cnt);
            }
        }
        return maxcnt;
    }
}
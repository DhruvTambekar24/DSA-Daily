class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Long,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put((long)num,map.getOrDefault((long)num,0)+1);
        }
        int res=1;
        if(map.containsKey(1L)){
            int cnt=map.get(1L);
            if(cnt%2==0) cnt--;
            res=Math.max(res,cnt);
        }
        for(long x:map.keySet()){
            if(x==1) continue;
            long curr=x;
            int len=0;
            while(true){
                Integer cnt=map.get(curr);
                if(cnt==null){
                    len=Math.max(1,len-1);
                    break;
                }

                if(cnt==1){
                    len++;
                    break;
                }
                len+=2;
                if(curr>1000000000L/curr){
                    len--;
                    break;
                }
                curr=curr*curr;
            }
            res=Math.max(res,len);
        }
        return res;
    }
}
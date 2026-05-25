class Solution {
    public int minBitFlips(int start, int goal) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        while(start!=0){
            l1.add(start%2);
            start=start/2;
        }
        while(goal!=0){
            l2.add(goal%2);
            goal=goal/2;
        }
        int cnt=0;
        int ms = Math.max(l1.size(),l2.size());
        for(int i=0;i<ms;i++){
           int ele1=(i<l1.size()) ? l1.get(i):0;
           int ele2=(i<l2.size()) ? l2.get(i):0;
            if(ele1!=ele2) cnt++;
        }
        return cnt;
    }
}
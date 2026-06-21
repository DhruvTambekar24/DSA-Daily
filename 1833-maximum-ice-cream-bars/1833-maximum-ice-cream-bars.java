class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        long total=0;
        int res=0;
        if(costs[0]>coins){
            return 0;
        }
        for(int i=0;i<costs.length;i++){
           total+=costs[i];
           if(total<=coins){
             res++;
           }
        }
        return res;
    }
}
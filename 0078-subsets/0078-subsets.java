class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        subSets(0,nums,nums.length,res,new ArrayList<>());
        return res;
    }

    public void subSets(int idx, int[] nums, int n, List<List<Integer>> res, List<Integer> ss) {
        int total=1<<n;
        for(int i=0;i<total;i++){
            List<Integer> subset = new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i &(1<<j)) != 0){
                    subset.add(nums[j]);
                }
            }
            res.add(subset);
        }
    }
}
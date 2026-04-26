class Solution {
    public void subSets(int idx,int[] nums,int n,List<List<Integer>> res,List<Integer> ss){
       if(idx==n){
        res.add(new ArrayList<>(ss));
        return;
       }
       //not pick
       subSets(idx+1,nums,n,res,ss);
       //pick
       ss.add(nums[idx]);
       subSets(idx+1,nums,n,res,ss);
       //removing
       ss.remove(ss.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new  ArrayList<>();
        int n = nums.length;
        subSets(0,nums,n,res,new ArrayList<>());
        return res;
    }
}
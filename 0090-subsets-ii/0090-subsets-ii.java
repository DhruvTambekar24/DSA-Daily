class Solution {
    public void subSets(int idx,int[] nums,List<List<Integer>> res,List<Integer> ss){
       res.add(new ArrayList<>(ss));
        for(int i = idx; i < nums.length; i++) {
            if(i>idx && nums[i]==nums[i-1]) continue;
            ss.add(nums[i]);
            subSets(i+1,nums,res,ss);
            ss.remove(ss.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new  ArrayList<>();
        subSets(0,nums,res,new ArrayList<>());
        return res;
    }
}
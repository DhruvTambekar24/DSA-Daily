class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        solve(nums,0,list,res);
        return res;
    }
    public void solve(int[] nums,int i,List<Integer> list,List<List<Integer>> res) {
        res.add(new ArrayList<>(list));
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]){
                continue;
            }
            list.add(nums[j]);
            solve(nums,j+1,list,res);
            list.remove(list.size()-1);
        }
    }
}
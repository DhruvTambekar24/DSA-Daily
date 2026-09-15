class Solution {
     public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        solve(candidates,target,0,list,res);
        return res;
    }

    public void solve(int[] candidates,int target,int i,List<Integer> list,List<List<Integer>> res) {
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        if(target<0 || i==candidates.length){
            return;
        }
        list.add(candidates[i]);
        solve(candidates,target-candidates[i],i,list,res);
        list.remove(list.size()-1);
        solve(candidates,target,i+1,list,res);
    }
}
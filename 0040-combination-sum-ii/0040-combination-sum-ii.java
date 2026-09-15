class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        Arrays.sort(candidates);
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
        for(int j=i;j<candidates.length;j++){
            if(j>i && candidates[j]==candidates[j-1]){
                continue;
            }
            if(candidates[j]>target){
                break;
            }
            list.add(candidates[j]);
            solve(candidates,target-candidates[j],j+1,list,res);
            list.remove(list.size()-1);
        }
    }
}
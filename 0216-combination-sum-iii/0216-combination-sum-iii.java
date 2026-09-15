class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        solve(k,n,1,list,res);
        return res;
    }
    public void solve(int k,int n,int i,List<Integer> list,List<List<Integer>> res) {
        if(k==0){
            if(n==0){
                res.add(new ArrayList<>(list));
            }
            return;
        }
        if(n<=0 || i>9){
            return;
        }
        for(int j=i;j<=9;j++){
            list.add(j);
            solve(k-1,n-j,j+1,list,res);
            list.remove(list.size()-1);
        }
    }
}
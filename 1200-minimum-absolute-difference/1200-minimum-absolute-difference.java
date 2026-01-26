class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subres = new ArrayList<>();
        int mad=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            int diff=arr[i+1]-arr[i];
            if(diff<mad){
                mad=diff;
                res.clear();
                subres.add(arr[i]);
                subres.add(arr[i+1]);
                res.add(new ArrayList<>(subres));
            }
            else if(diff==mad){
                subres.add(arr[i]);
                subres.add(arr[i+1]);
                res.add(new ArrayList<>(subres));
            }
            subres.clear();
        }
        return res;
    }
}
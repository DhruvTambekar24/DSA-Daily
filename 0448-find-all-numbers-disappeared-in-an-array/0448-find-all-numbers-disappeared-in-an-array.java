class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=-1;
        }
        for(int i=0;i<n;i++){
            arr[nums[i]-1]=0;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==-1){
                res.add(i+1);
            }
        }
        return res;
    }
}
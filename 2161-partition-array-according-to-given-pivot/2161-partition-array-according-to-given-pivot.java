class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        List<Integer> less=new ArrayList<>();
        List<Integer> same=new ArrayList<>();
        List<Integer> more=new ArrayList<>();
        for(int num : nums){
            if(num<pivot){
                less.add(num);
            }else if(num==pivot){
                same.add(num);
            }else{
                more.add(num);
            }
        }
        int[] res=new int[n];
        int i=0;
        for(int num : less) res[i++]=num;
        for(int num : same) res[i++]=num;
        for(int num : more) res[i++]=num;
        
        return res;
    }
}
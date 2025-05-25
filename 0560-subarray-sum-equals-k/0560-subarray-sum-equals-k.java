class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count =0;
        int[] prefixSum = new int[n];
        prefixSum[0]=nums[0];
        for(int i=1;i<n;i++){
          prefixSum[i]=prefixSum[i-1]+nums[i];
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0, 1);
         for(int i=0;i<n;i++){
            int currentSum = prefixSum[i];
            int remaining = currentSum - k;
            if(hm.containsKey(remaining)) {
                count += hm.get(remaining);
            }
            hm.put(currentSum, hm.getOrDefault(currentSum, 0) + 1);
        }
       return count;  
    }
}
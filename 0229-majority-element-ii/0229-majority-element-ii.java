class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> majority = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
           hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        int mcnt=n/3;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if(entry.getValue() > mcnt) {
                majority.add(entry.getKey());
            }
        }
        return majority;
    }
}
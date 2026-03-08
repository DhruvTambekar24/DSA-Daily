class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n =nums.length; 
        HashSet<String> set = new HashSet<>();
        for(String s : nums){
            set.add(s);
        }
        int limit=1<<n;
        for(int i=0;i<limit;i++){
            String bin = Integer.toBinaryString(i);
            while(bin.length()<n){
                bin = "0" + bin;
            }       
            if(!set.contains(bin)){
                return bin;
            }
        }
        return "";
    }
}
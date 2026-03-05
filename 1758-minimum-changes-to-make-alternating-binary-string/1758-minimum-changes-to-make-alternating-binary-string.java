class Solution {
    public int minOperations(String s) {
        int cnt=0;
        int n = s.length();
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<n;i++){
            char exp1;
            if(i%2==0){
                exp1='0';
            } else {
                exp1='1';
            }
            char exp2;
            if(i%2==0){
                exp2='1';
            } else {
                exp2='0';
            }
            if(s.charAt(i) != exp1){
                count1++;
            }
            if(s.charAt(i) != exp2){
                count2++;
            }
        }
        return Math.min(count1, count2);
    }
}
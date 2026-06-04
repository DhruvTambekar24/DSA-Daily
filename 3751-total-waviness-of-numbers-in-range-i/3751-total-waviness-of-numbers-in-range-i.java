class Solution {
    public int totalWaviness(int num1, int num2) {
        int peak=0;
        int valley=0;
        for(int j=num1;j<=num2;j++){
            String s = String.valueOf(j);
            int n = s.length();
            if(n<3) continue;
            for(int i=1;i<n-1;i++){
               int prev=s.charAt(i-1)-'0';
               int curr=s.charAt(i)-'0';
               int next=s.charAt(i+1)-'0';
               if(curr>prev && curr>next) peak++; 
               else if(curr<prev && curr<next) valley++;
            }
        }
        return peak+valley;
    }
}
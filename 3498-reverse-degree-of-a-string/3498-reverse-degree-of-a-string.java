class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            int c='z'-s.charAt(i)+1;
            int pos=i+1;
            sum+=c*pos;
        }
        return sum;
    }
}
class Solution {
    public int[] validSequence(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int[] res=new int[m];
        int[] l=new int[m];
        Arrays.fill(l,-1);
        int i=n-1;
        int j=m-1;
        while(i>=0 && j>=0){
            if(word1.charAt(i)==word2.charAt(j)){
                l[j]=i;
                j--;
            }
            i--;
        }
        boolean diff=false;
        j=0;
        for(i=0;i<n && j<m;i++){
            if(word1.charAt(i)==word2.charAt(j)){
                res[j]=i;
                j++;
            } else if(!diff &&(j==m-1 || i<l[j+1])){
                res[j]=i;
                j++;
                diff=true;
            }
        }
        if(j==m){
            return res;
        }
        return new int[0];
    }
}
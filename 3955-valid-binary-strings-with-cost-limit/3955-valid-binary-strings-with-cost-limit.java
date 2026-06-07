class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> res = new ArrayList<>();
        for(int i=0;i<(1<<n);i++){
            StringBuilder s = new StringBuilder();
            int c=0;
            boolean valid=true;
            for(int j=0;j<n;j++){
                int b=(i>>(n-1-j))&1;
                s.append(b);
                if(b==1){
                    c=c+j;
                    if(j>0 && s.charAt(j-1)=='1'){
                        valid=false;
                        break;
                    }
                }
            }
            if(valid && c<=k){
                res.add(s.toString());
            }
        }
        return res;
    }
}
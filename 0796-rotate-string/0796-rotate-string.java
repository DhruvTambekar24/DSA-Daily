class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        if(s.length()==0&&goal.length()==0){
            return true;
        }
        int ptr = -1;
        int n = s.length();
        for(int i=0;i<n;i++){
            char start = s.charAt(0);
            if(start==goal.charAt(i)){
                int j = i;
                boolean res = true;
                for(int k=0;k<n;k++){
                    if(s.charAt(k)!=goal.charAt(j)){
                        res = false;
                        break;
                    }
                    j=(j+1)%n;
                }
                if(res){
                    ptr = i;
                    break;
                }
            }
        }
        if(ptr==-1){
            return false;
        }
        return true;
    }
}
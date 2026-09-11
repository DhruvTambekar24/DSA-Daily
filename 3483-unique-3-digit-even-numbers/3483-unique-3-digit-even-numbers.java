class Solution {
    public int totalNumbers(int[] digits) {
        int[] freq=new int[10];
        for(int x:digits){
            freq[x]++;
        }
        int ans=0;
        for(int num=100;num<=999;num++){
            if(num%2!=0){
                continue;
            }
            int x=num;
            int a=x%10;
            x/=10;
            int b=x%10;
            x/=10;
            int c=x%10;
            int[] used=new int[10];
            used[a]++;
            used[b]++;
            used[c]++;
            boolean ispos=true;
            for(int i=0;i<10;i++){
                if(used[i]>freq[i]){
                    ispos=false;
                    break;
                }
            }
            if(ispos){
                ans++;
            }
        }
        return ans;
    }
}
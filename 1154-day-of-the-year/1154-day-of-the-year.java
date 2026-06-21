class Solution {
    public int dayOfYear(String date) {
        String[] srr=date.split("-");
        int y=Integer.parseInt(srr[0]);
        int m=Integer.parseInt(srr[1]);
        int d=Integer.parseInt(srr[2]);
        int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
        if((y%4==0 && y%100!=0)|| y%400==0){
            days[1]=29;
        }
        int res=0;
        for(int i=0;i<m-1;i++){
            res=res+days[i];
        }
        res=res+d;
        return res;
    }
}
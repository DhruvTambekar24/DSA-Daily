class Solution {
    public int findClosest(int x, int y, int z) {
        int distx=Math.abs(z-x);
        int disty=Math.abs(z-y);
        if(distx>disty){
            return 2;
        }
        else if(distx<disty){
            return 1;
        }
        else{
            return 0;
        }
    }
}
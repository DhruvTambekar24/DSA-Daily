class Solution {
    public double angleClock(int hour, int minutes) {
        double minpos=minutes*6;
        double hrpos=(hour%12)*30+minutes*0.5;
        double res=Math.abs(hrpos-minpos);
        return Math.min(res,360-res);

    }
}
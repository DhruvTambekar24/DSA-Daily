class Solution {
    public int maxDistance(String moves) {
        int x=0;
        int y=0;
        int blanks=0;
        for(char c : moves.toCharArray()){
            if(c=='U')y++;
            else if(c=='D')y--;
            else if(c=='R')x++;
            else if(c=='L')x--;
            else blanks++;
        }
        int res=Math.abs(x)+Math.abs(y);
        return res+blanks;
    }
}
class Solution {
    public boolean exist(char[][] board,String word) {
    int m=board.length;
    int n=board[0].length;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(board[i][j]==word.charAt(0)){
                if(solve(board,word,i,j,0)){
                     return true;
                }
                }
            }
        }
        return false;
    }
    public boolean solve(char[][] board,String word,int i,int j,int k){
        if(k==word.length()){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length){
            return false;
        }
        if(board[i][j]!=word.charAt(k)){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='#';
        boolean found=solve(board,word,i+1,j,k+1) || solve(board,word,i-1,j,k+1) || solve(board,word,i,j+1,k+1) || solve(board,word,i,j-1,k+1);
        board[i][j]=temp;
        return found;
    }
}
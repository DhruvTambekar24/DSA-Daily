class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if(rows==0) return "";
        int cols=encodedText.length() / rows;
        char[][] arr = new char[rows][cols];
        int k=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=encodedText.charAt(k++);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int l=0;l<cols;l++){
            int i=0;
            int j=l;
            while(i<rows && j<cols){
                char c = arr[i][j];
                i++;
                j++;
                sb.append(c);
            }
        }
        int end = sb.length()-1;
        while(end>=0 && sb.charAt(end)== ' ') {
            end--;
        }
        return sb.substring(0,end+1);
    }
}
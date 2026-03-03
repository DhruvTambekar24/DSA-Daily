class Solution {
    public static String invertBinaryString(String bs){
        StringBuilder inv = new StringBuilder(bs.length());
        for(char bit:bs.toCharArray()){
             if(bit == '0') {
                inv.append('1');
            } else{
                inv.append('0');
            }
        }
        return inv.toString();
    }
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder();
        sb.append("0");
        for(int i=1;i<n;i++){
            String s = sb.toString();
            sb.append("1");
            String s1 = invertBinaryString(s);
            String rev = new StringBuilder(s1).reverse().toString();
            sb.append(rev);
        }
        String fi = sb.toString();
        char res = fi.charAt(k-1);
        return res;
    }
}
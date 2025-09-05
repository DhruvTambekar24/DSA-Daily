class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        return helper(num1, num2, 1);
    }
    private int helper(long num1, long num2, int ops) {
         if (ops > 60) return -1;
         long val = num1 - (long)num2 * ops;
         if (val >= ops && Long.bitCount(val) <= ops) {
           return ops;
        }
        return helper(num1, num2, ops + 1);
    }
}
class Solution {
    public boolean isPalindrome(String s) {
        return checkPalindrome(s.toLowerCase(), 0, s.length() - 1);
    }
    private boolean checkPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (!Character.isLetterOrDigit(s.charAt(left))) {
            return checkPalindrome(s, left + 1, right);
        }
        if (!Character.isLetterOrDigit(s.charAt(right))) {
            return checkPalindrome(s, left, right - 1);
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return checkPalindrome(s, left + 1, right - 1);
    }
}
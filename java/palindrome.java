class Solution {
    public boolean isPalindrome(int x) {
        String stringx = String.valueOf(x);

        String reversed = new StringBuilder(stringx).reverse().toString();

        return stringx.equals(reversed);
    }
}
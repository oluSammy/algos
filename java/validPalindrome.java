class Solution {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            boolean isLeftAlphanumeric = isAlphanumeric(chars[left]);

            while((left < right) && !isLeftAlphanumeric) {
                left++;
                isLeftAlphanumeric = isAlphanumeric(chars[left]);
            }

            boolean isRightAlphanumeric = isAlphanumeric(chars[right]);
            while((left < right) && !isRightAlphanumeric) {
                right--;
                isRightAlphanumeric = isAlphanumeric(chars[right]);
            }

            if (Character.toLowerCase(chars[right]) == Character.toLowerCase(chars[left])) {
                right--;
                left++;
            } else {
                return false;
            }
        }

        return true;        
    }

    public boolean isAlphanumeric(char c) {
        boolean isValid =
            (c >= '0' && c <= '9') ||
            (c >= 'a' & c <='z') ||
            (c >= 'A' & c <= 'Z');

        return isValid;
    }
}
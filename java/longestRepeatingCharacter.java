class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> characterCount = new HashMap();
        char[] charArray = s.toCharArray();
        int maxValid = 0;
        int maxOccurrence = 0;
        int left = 0;


        for (int right = 0; right < charArray.length; right++) {
            Character currentChar = charArray[right];
            int newCount = 1;

            if (characterCount.containsKey(currentChar)) {
                newCount = characterCount.get(currentChar) + newCount;
                characterCount.put(currentChar, newCount);
            } else {
                characterCount.put(currentChar, newCount);
            }

            maxOccurrence = Math.max(maxOccurrence, newCount);

            // if invalid, move left pointer right
            while (((right - left) + 1) - maxOccurrence > k) {
                Character leftChar = charArray[left];
                int prevLeft = characterCount.get(leftChar);
                characterCount.put(leftChar, prevLeft - 1);

                left++;
            };

            maxValid = Math.max(maxValid, (right - left) + 1);
        }

        return maxValid;
    };
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        int left = 0;
        HashMap<Character, Integer> characters = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            char currrentCharacter = s.charAt(i);

            if (characters.containsKey(currrentCharacter) && characters.get(currrentCharacter) >= left ) {
                left = characters.get(currrentCharacter) + 1;
            }
            characters.put(currrentCharacter, i); 
            longest = Math.max(longest, i - left + 1);
        };

        return longest;
    };
};
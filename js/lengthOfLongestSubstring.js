var lengthOfLongestSubstring = function(s) {
    let left = 0;
    let longest = 0;
    const map = {};

    for (let i = 0; i < s.length; i++) {
       // if map contains the current character and the character is in the current window
       if (map[s[i]] !== undefined && map[s[i]] >= left) {
        left = map[s[i]] + 1
       }

       map[s[i]] = i;
       longest = Math.max(longest, (i - left) + 1)
    }

    return longest;
};
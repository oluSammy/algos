/**
 * @param {string} s
 * @param {number} k
 * @return {number}
 */
const characterReplacement = function(s, k) {
    let left = 0;
    let maxOccurence = 0;
    const characterCount = {}
    let maxValid = 0;

    for (let right = 0; right < s.length; right++) {
        const newCharCount = (characterCount[s[right]] ?? 0) + 1
        characterCount[s[right]] = newCharCount

        maxOccurence = Math.max(maxOccurence, newCharCount);

        // if window is invalid, shrink from the left
        // if window length - maxOccurence <= k
        while (((right + 1) - left) - maxOccurence > k) {
            characterCount[s[left]]--
            left++;
        }

        maxValid = Math.max(maxValid, (right + 1) - left)
    }

    return maxValid;
};
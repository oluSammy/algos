/**
 * @param {string} s
 * @return {boolean}
 */

function isAlphanumeric(char) {
    if (!Boolean(char)) return false;
    const code = char.charCodeAt(0);

    return (code >= 48 && code <= 57) // 0-9
        || (code >= 65 && code <= 90) // A - Z
        || (code >= 97 && code <= 122) // a - z
}

var isPalindrome = function(s) {
    let left = 0;
    let right = s.length - 1;

    while (left < right) {
        let isLeftAlphaNumeric = isAlphanumeric(s[left]);

        while (left < right && !isLeftAlphaNumeric) {
            left++;
            isLeftAlphaNumeric = isAlphanumeric(s[left]);
        }


        let isRightAlphaNumeric = isAlphanumeric(s[right]);
        while (left < right && !isRightAlphaNumeric) {
            right--;
            isRightAlphaNumeric = isAlphanumeric(s[right]);
        }

        if (s[left].toLowerCase() === s[right].toLowerCase()) {
            right--;
            left++
        } else {
            return false;
        }
    }

    return true;
};
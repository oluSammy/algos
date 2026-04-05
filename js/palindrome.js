/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    const reversed = +[...x.toString()].reverse().join("");
    return reversed === x;
};
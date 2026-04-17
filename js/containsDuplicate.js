/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    const numberSet = new Set();

    for(let i = 0; i < nums.length; i++) {
        if (numberSet.has(nums[i])) {
            return true
        }

        numberSet.add(nums[i])
    }

    return false;
};
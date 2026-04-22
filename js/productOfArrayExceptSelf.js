/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelfBruteForce = function(nums) {
    const prefix = [];

    let multiplier = 1;
    for (let i = 0; i < nums.length; i++) {
        prefix[i] = multiplier;
        multiplier = nums[i] * multiplier;
    }

    // console.log({ prefix })

    const postFix = []
    let postFixMultiplier = 1
    for (let i = nums.length - 1; i >= 0; i--) {
        postFix[i] = postFixMultiplier;
        postFixMultiplier = nums[i] * postFixMultiplier;
    }

    console.log({ postFix, prefix })
    const output = [];
    for (let i = 0; i < nums.length; i++)  {
        output[i] = postFix[i] * prefix[i]
    }   

    return output;
};

// optimal solution o(n) time and o(1) space
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
    const output = [];

    let multiplier = 1;
    for (let i = 0; i < nums.length; i++) {
        output[i] = multiplier;
        multiplier = nums[i] * multiplier;
    }

    // const output = [];
    let postFixMultiplier = 1
    for (let i = nums.length - 1; i >= 0; i--) {
        output[i] = postFixMultiplier * output[i]
        postFixMultiplier = nums[i] * postFixMultiplier;

    }
    return output;
};
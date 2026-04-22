class Solution {
    public int[] productExceptSelfBruteForce(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        // calculate prefixes
        int multiplier = 1;
        for (int i = 0; i < nums.length; i++) {
            prefix[i] = multiplier * nums[i];
            multiplier = multiplier * nums[i];
        }

        // calculate suffixes
        int suffixMultiplier = 1;
        int[] output = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            suffix[i] = suffixMultiplier * nums[i];
            suffixMultiplier = suffixMultiplier * nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int newSuffix = i == 0 ? 1 : prefix[i - 1];
            int newPrefix = i == nums.length - 1 ? 1 : suffix[i + 1];
            output[i] = newSuffix * newPrefix;
        }

        return output;
    };

    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];

        // calculate prefix
        int multiplier = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] = multiplier;
            multiplier = nums[i] * multiplier;
        }

        int postFixMultiplier = 1;
        for (int i = nums.length - 1; i >=0; i-- ) {
            output[i] = output[i] * postFixMultiplier;
            postFixMultiplier = nums[i] * postFixMultiplier;
        }

        return output;
    };
}
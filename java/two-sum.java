import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                int val = map.get(diff);
                return new int[]{val, i};
            }

            map.put(nums[i], i);
        }

        return new int[]{0,0};
    };
};
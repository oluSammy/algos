class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> occurences = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (occurences.containsKey(nums[i])) {
                return true;
            };

            occurences.put(nums[i], 1);
        }

        return false;        
    }
}
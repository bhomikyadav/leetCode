class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapping = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (mapping.containsKey(nums[i])) {
                return new int[] { mapping.get(nums[i]), i };
            }

            mapping.put(target - nums[i], i);
        }

        return new int[] { -1, -1 };
    }
}
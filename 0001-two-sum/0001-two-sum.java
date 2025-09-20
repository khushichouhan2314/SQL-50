class Solution {
    public int[] twoSum(int[] nums, int target) {

        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int first = nums[i];
            int complement = target - first;
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(first, i);
        }

        return new int[] {};
    }

}
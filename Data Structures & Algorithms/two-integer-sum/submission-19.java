class Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            var dif = target - nums[i];
            if (map.containsKey(dif)) {
                return new int[] {map.get(dif), i};
            } else {
            map.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
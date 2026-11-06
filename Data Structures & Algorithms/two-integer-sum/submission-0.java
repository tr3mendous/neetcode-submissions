class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; nums.length > i; i++){
            int dif = target - nums[i];
            if (map.containsKey(dif)){
                return new int[] {map.get(dif), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[2];
    }
}

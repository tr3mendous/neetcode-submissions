class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            var first = i + 1;
            var second = nums.length - 1;
            var target = -nums[i];
            while (first < second) {
                if (nums[first] + nums[second] > target) {
                    second--;
                } else if (nums[first] + nums[second] < target) {
                    first++;
                } else {
                    res.add(List.of(nums[i], nums[first], nums[second]));
                    first++;
                    second--;
                }
            }
        }
        return res.stream().toList();
    }
}

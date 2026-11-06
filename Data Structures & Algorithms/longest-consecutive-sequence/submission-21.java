class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        var numSet = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        var longest = 0;
        var current = 0;
        for (var num : numSet) {
            if (!numSet.contains(num - 1)) {
                current = 1;
                while (numSet.contains(num + current)) {
                    current++;
                }
            }
            if (current > longest) {
                longest = current;
            }
        }
        return longest;
    }
}

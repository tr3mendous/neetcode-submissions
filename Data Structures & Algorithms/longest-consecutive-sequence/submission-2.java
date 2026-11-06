class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int longestSequense = 1;
        int currentSequence = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] == nums[i - 1] + 1) {
                currentSequence++;
            } else {
                if (currentSequence > longestSequense) {
                    longestSequense = currentSequence;
                }
                currentSequence = 1;
            }
        }
        if (currentSequence > longestSequense) {
            longestSequense = currentSequence;
        }
        return longestSequense;
    }
}

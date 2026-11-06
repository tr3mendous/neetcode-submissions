class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int begin = 0;
        int end = nums.length - 1;
        while (begin <= end) {
            int index = (begin + end) / 2;
            if (nums[index] == target) {
                return index;
            }
            if (nums[index] < target) {
                begin = index + 1;
            }
            if (nums[index] > target) {
                end = index - 1;
            }
        }
        return -1;
    }
}

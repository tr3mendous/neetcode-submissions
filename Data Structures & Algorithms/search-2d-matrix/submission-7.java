class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        var arrayIndex = 0;
        var firstNumber = matrix[arrayIndex][0];
        var lastNumber = matrix[arrayIndex][matrix[arrayIndex].length - 1];

        while (lastNumber < target) {
            arrayIndex++;
            if (arrayIndex >= matrix.length) {
                return false;
            }
            lastNumber = matrix[arrayIndex][matrix[arrayIndex].length - 1];
        }

        var nums = matrix[arrayIndex];
        var start = 0;
        var end = nums.length - 1;
        while (end >= start) {
            var mid = (start + end) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            }
        }
        return false;
    }
}

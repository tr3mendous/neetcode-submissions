class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] prefixHeights = new int[n];
        int[] suffixHeights = new int[n];

        prefixHeights[0] = height[0];
        for (int i = 1; i < n; i++) {
            prefixHeights[i] = Math.max(prefixHeights[i - 1], height[i]);
        }

        suffixHeights[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixHeights[i] = Math.max(suffixHeights[i + 1], height[i]);
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + Math.min(prefixHeights[i], suffixHeights[i]) - height[i];
        }
        return sum;
    }
}

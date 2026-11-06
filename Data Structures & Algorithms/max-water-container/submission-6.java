class Solution {
    public int maxArea(int[] heights) {
        var first = 0;
        var second = heights.length - 1;
        var volume = 0;
        while (first < second) {
            var hight = Math.min(heights[first], heights[second]);
            var width = second - first;
            var currentVolume = hight * width;
            if (currentVolume > volume) {
                volume = currentVolume;
            }
            if (heights[first] > heights[second]) {
                second--;
            } else {
                first++;
            }
        }
        return volume;
    }
}

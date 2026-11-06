class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        var string = s.toCharArray();
        var substring = new HashSet<Character>();
        var left = 0;
        var right = 0;
        var res = 0;
        while (right < string.length) {
            if (!substring.add(string[right])) {
                substring.remove(string[left]);
                left++;
            } else {
                right++;
            }
            res = Math.max(res, right - left);
        }
        return Math.max(res, right - left);
    }
}

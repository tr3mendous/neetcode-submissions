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
        var res = 0;
        for (int right = 0; right < string.length; right++) {
            while (substring.contains(string[right])) {
                substring.remove(string[left]);
                left++;
            }
            substring.add(string[right]);
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}

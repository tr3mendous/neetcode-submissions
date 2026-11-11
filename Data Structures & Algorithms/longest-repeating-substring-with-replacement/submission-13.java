class Solution {
    public int characterReplacement(String s, int k) {
        var string = s.toCharArray();
        var set = new HashSet<Character>();
        var res = 0;

        if (s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }

        for (var c : string) {
            set.add(c);
        }

        for (var character : set) {
            var left = 0;
            var counter = 0;
            for (int right = 0; right < string.length; right++) {
                if (string[right] != character) {
                    counter++;
                    if (counter > k) {
                        while (counter > k) {
                            if (string[left] != character) {
                                counter--;
                            }
                            left++;
                        }
                    }
                }
                res = Math.max(res, right - left + 1);
            }
        }
        return res;
    }
}

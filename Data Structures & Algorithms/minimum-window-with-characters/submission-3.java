class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()){
            return "";
        }
        var tMap = new HashMap<Character, Integer>();
        for (var c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        var l = 0;
        var sMap = new HashMap<Character, Integer>();
        var have = tMap.keySet().size();
        var count = 0;
        int[] res = new int[]{-1, -1};
        var length = Integer.MAX_VALUE;
        for (int r = 0; r < s.length(); r++) {
            var c = s.charAt(r);
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
            if (tMap.keySet().contains(c) && sMap.get(c).equals(tMap.get(c))) {
                count++;
            }

            while (have == count) {
                if (r - l + 1 < length) {
                    res[0] = l;
                    res[1] = r;
                    length = r - l + 1;
                }

                var leftChar = s.charAt(l);
                sMap.put(leftChar, sMap.get(leftChar) - 1);
                if (tMap.keySet().contains(leftChar) && sMap.get(leftChar) < tMap.get(leftChar)) {
                    count--;
                }
                l++;
            }
        }
        return length == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}

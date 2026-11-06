class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || (s.length() != t.length())){
            return false;
        }
        var map1 = new HashMap<Character, Integer>();
        var map2 = new HashMap<Character, Integer>();
        var charS = s.toCharArray();
        var charT = t.toCharArray();
        for (int i = 0; i < s.length(); i++){
            var char1 = charS[i];
            map1.compute(char1, (k, v) -> v== null ? 1 : v + 1);
            var char2 = charT[i];
            map2.compute(char2, (k, v) -> v == null ? 1 : v + 1);
        }
        return map1.equals(map2);
    }
}

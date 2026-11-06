class Solution {
    public boolean isAnagram(String s, String t) {
        var map1 = new HashMap<Character, Integer>();
        var map2 = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (map1.containsKey(s.charAt(i))) {
                Integer in = map1.get(s.charAt(i));
                map1.replace(s.charAt(i), ++in);
            } else {
                map1.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (map2.containsKey(t.charAt(i))) {
                Integer in = map2.get(t.charAt(i));
                map2.replace(t.charAt(i), ++in);
            } else {
                map2.put(t.charAt(i), 1);
            }
        }
        return map1.equals(map2);
    }
}

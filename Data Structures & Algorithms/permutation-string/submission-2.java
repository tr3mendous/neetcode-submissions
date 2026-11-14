class Solution {
    public boolean checkInclusion(String s1, String s2) {
                Map<Character, Integer> mapS1 = new HashMap<>();

       if (s1.length() > s2.length()) {
           return false;
       }

        for (var c : s1.toCharArray()) {
            mapS1.put(c, mapS1.getOrDefault(c, 0) + 1);
        }

        var overlap = mapS1.size();
        for (var i = 0; i < s2.length(); i++) {
            Map<Character, Integer> mapS2 = new HashMap<>();
            var count = 0;
            for (var j = i; j < s2.length(); j++) {
                mapS2.put(s2.charAt(j), mapS2.getOrDefault(s2.charAt(j), 0) + 1);

                if (mapS1.getOrDefault(s2.charAt(j), 0) < mapS2.get(s2.charAt(j))) {
                    break;
                }
                if (mapS1.getOrDefault(s2.charAt(j), 0).equals(mapS2.get(s2.charAt(j)))) {
                    count++;
                }
            }
            if (count == overlap) {
                return true;
            }
        }
        return false;
    }
}

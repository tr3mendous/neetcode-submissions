class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> firstStringMap = new HashMap<>();
        Map<Character, Integer> secondStringMap = new HashMap<>();
        char[] firstString = s.toCharArray();
        char[] secondString = t.toCharArray();
        for (int i = 0; firstString.length > i; i++){
            if (!firstStringMap.containsKey(firstString[i])){
                firstStringMap.put(firstString[i], 1);
            } else {
                firstStringMap.put(firstString[i], firstStringMap.get(firstString[i]) + 1);
            }
        }
        for (int i = 0; secondString.length > i; i++){
            if (!secondStringMap.containsKey(secondString[i])){
                secondStringMap.put(secondString[i], 1);
            } else {
                secondStringMap.put(secondString[i], secondStringMap.get(secondString[i]) + 1);
            }
        }
        return firstStringMap.equals(secondStringMap);
    }
}

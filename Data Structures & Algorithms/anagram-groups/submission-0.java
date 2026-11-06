class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> words = new HashMap<>();
        for (int i = 0; strs.length > i; i++){
            int[] key = new int[26];
            char[] str = strs[i].toCharArray();
            for (int j = 0; str.length > j; j++) {
                key[str[j] - 'a'] = key[str[j] - 'a'] + 1;
            }
            String k = Arrays.toString(key);
            if (!words.containsKey(k)){
                words.put(k, new ArrayList<>());
                words.get(k).add(strs[i]);
            } else {
                words.get(k).add(strs[i]);
            }
        }
        return new ArrayList<>(words.values());
    }

}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 1) {
            return List.of(List.of(strs[0]));
        }

        var a = 'a';
        Map<String, List<String>> map = new HashMap();
        for (var str : strs) {
            int[] vocabulary = new int[26];
            for (var c : str.toCharArray()) {
                var index = c - a;
                vocabulary[index] = vocabulary[index] + 1;
            }
            //List<Integer> key = Arrays.stream(vocabulary).boxed().toList();
            var key = Arrays.toString(vocabulary);
            map.computeIfAbsent(key, k -> new ArrayList()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}

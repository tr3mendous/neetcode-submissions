class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList<>(nums.length);

        for (int i = 0; i <= nums.length; i++) {
            list.add(new ArrayList<>());
        }

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (var entry : map.entrySet()) {
            list.get(entry.getValue()).add(entry.getKey());
        }

        int[] res = new int[k];
        int counter = 0;
        for (int i = list.size() - 1; i != 0; i--) {
            for (int n : list.get(i)) {
                if (counter < k) {
                    res[counter] = n;
                    counter++;
                }
            }
        }
        return res;
    }
}

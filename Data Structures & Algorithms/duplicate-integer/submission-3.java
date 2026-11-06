class Solution {
    public boolean hasDuplicate(int[] nums) {
        var numSet = new HashSet<Integer>();
        for (int i : nums) {
            if (!numSet.add(i)) {
                return true;
            }
        }
        return false;
    }
}
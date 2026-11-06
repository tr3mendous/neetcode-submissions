class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int i = 0; nums.length > i; i++){
            if (!unique.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
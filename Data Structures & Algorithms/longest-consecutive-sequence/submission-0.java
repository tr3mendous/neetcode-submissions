class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums){
            numbers.add(num);
        }
        Integer i = null;
        int longestConsecutive = 0;
        int consecutive = 1;
        for (int num : nums){
            if (!numbers.contains(num - 1)){
                i=num;
                while (numbers.contains(i+1)){
                    i++;
                    consecutive++;
                }
                if (consecutive > longestConsecutive){
                    longestConsecutive = consecutive;
                }
                consecutive = 1;
            }
    }
    return longestConsecutive;
}
}
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] string = s.toCharArray();
        int left = 0;
        int right = string.length - 1;
        while (left < right){
            if (string[left] != string[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

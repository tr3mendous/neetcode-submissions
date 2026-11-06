class Solution {
    public boolean isPalindrome(String s) {
        var arr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
        var first = 0;
        var second = arr.length - 1;
        while (first <= second){
            if (arr[first] != arr[second]) {
                return false;
            }
            first++;
            second--;
        }
        return true;
    }
}

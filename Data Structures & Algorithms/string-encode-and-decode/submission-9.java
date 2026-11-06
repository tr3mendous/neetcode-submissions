class Solution {
    public String encode(List<String> strs) {
        if (strs.size() == 0) {
            return null;
        } else {
            return String.join("&&&", strs);
        }
    }

    public List<String> decode(String str) {
        if (str == null){
            return List.of();
        }
        String[] strings = str.split("&&&", -1);
        return Arrays.asList(strings);
    }
}

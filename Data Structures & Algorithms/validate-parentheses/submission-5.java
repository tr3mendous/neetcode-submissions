class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        for (char c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                brackets.push(c);
            }
        
            if (brackets.isEmpty() ||
                c == ')' && brackets.pop() != '(' ||
                c == ']' && brackets.pop() != '[' ||
                c == '}' && brackets.pop() != '{'){
                return false;
            }
        }
        return brackets.size() == 0;
    }
}

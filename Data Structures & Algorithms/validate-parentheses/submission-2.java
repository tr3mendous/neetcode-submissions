class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        try {
        for (char c : s.toCharArray()){
            if (c == '(' || c == '[' || c == '{'){
                brackets.push(c);
            }
        
            if (c == ')' && brackets.pop() != '(' ||
            c == ']' && brackets.pop() != '[' ||
            c == '}' && brackets.pop() != '{'){
                return false;
            }
        }} catch (EmptyStackException e){
            return false;
        }
        return brackets.size() == 0;
    }
}

import java.util.ArrayDeque;
class Solution {
    public boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else if (c == '}' || c == ']' || c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.pop();

                if (c == '}' && last != '{') {
                    return false;
                }
                if (c == ']' && last != '[') {
                    return false;
                }
                if (c == ')' && last != '(') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
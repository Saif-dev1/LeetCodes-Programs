import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentCh = s.charAt(i);

            if (currentCh == '(' || currentCh == '{' || currentCh == '[') {
                stack.push(currentCh);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((currentCh == ')' && top != '(') ||
                    (currentCh == '}' && top != '{') ||
                    (currentCh == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

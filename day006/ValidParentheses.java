package day006;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 20. Valid Parentheses
 *
 * @author created by sunjy on 11/3/24
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                deque.push(c);
            } else {
                if (deque.isEmpty()) {
                    return false;
                }
                char top = deque.pop();
                if (c == ')' && top != '(') {
                    return false;
                }
                if (c == '}' && top != '{') {
                    return false;
                }
                if (c == ']' && top != '[') {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }

}

package day024;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1190. Reverse Substrings Between Each Pair of Parentheses
 *
 * @author created by sunjy on 12/10/24
 */
public class ReverseSubstringsBetweenEachPairParentheses {

    public String reverseParentheses(String s) {
        Deque<StringBuilder> stack = new ArrayDeque<>();
        StringBuilder current = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(current);
                current = new StringBuilder();
            } else if (c == ')') {
                StringBuilder temp = current;
                current = stack.pop();
                current.append(temp.reverse());
            } else {
                current.append(c);
            }
        }

        return current.toString();
    }

}

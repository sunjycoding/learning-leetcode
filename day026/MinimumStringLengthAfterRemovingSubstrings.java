package day026;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 2696. Minimum String Length After Removing Substrings
 *
 * @author created by sunjy on 12/14/24
 */
public class MinimumStringLengthAfterRemovingSubstrings {

    public int minLength(String s) {
        Deque<Character> stack = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() &&
                    (stack.peek() == 'A' && c == 'B' || stack.peek() == 'C' && c == 'D')) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.size();
    }

}

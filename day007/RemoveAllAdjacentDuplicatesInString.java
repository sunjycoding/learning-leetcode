package day007;

/**
 * 1047. Remove All Adjacent Duplicates In String
 *
 * @author created by sunjy on 11/4/24
 */
public class RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int len = stack.length();
            if (len > 0 && stack.charAt(len - 1) == c) {
                stack.deleteCharAt(len - 1);
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }

}

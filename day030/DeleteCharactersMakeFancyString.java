package day030;

/**
 * 1957. Delete Characters to Make Fancy String
 *
 * @author created by sunjy on 12/21/24
 */
public class DeleteCharactersMakeFancyString {

    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                count = 1;
            } else {
                count++;
            }
            if (count < 3) {
                result.append(s.charAt(i));
            }
        }
        return s.charAt(0) + result.toString();
    }

}

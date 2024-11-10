package day012;

/**
 * 58. Length of Last Word
 *
 * @author created by sunjy on 11/9/24
 */
public class LengthLastWord {

    public int lengthOfLastWord(String s) {
        int result = 0;
        int length = s.length();

        int i = length - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            result++;
            i--;
        }

        return result;
    }

}

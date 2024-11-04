package day006;

/**
 * 151. Reverse Words in a String
 *
 * @author created by sunjy on 11/3/24
 */
public class ReverseWordsString {

    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        StringBuilder result = new StringBuilder();

        int left = 0;
        int right = words.length - 1;

        while (left <= right) {
            result.append(words[right]);
            right--;
            if (left <= right) {
                result.append(" ");
            }
        }

        return result.toString();
    }

}

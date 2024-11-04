package day006;

/**
 * 28. Find the Index of the First Occurrence in a String
 *
 * @author created by sunjy on 11/3/24
 */
public class FindIndexFirstOccurrenceString {

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }

        int n = haystack.length();
        int m = needle.length();

        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }

        return -1;
    }

}

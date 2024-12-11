package day024;

/**
 * 1910. Remove All Occurrences of a Substring
 *
 * @author created by sunjy on 12/10/24
 */
public class RemoveAllOccurrencesSubstring {

    public String removeOccurrences(String s, String part) {
        int start = s.indexOf(part);
        while (start != -1) {
            s = s.substring(0, start) + s.substring(start + part.length());
            start = s.indexOf(part);
        }
        return s;
    }

}

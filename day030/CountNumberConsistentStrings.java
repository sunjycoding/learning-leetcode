package day030;

import java.util.HashSet;
import java.util.Set;

/**
 * 1684. Count the Number of Consistent Strings
 *
 * @author created by sunjy on 12/21/24
 */
public class CountNumberConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        Set<Character> allowedSet = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            allowedSet.add(allowed.charAt(i));
        }
        for (String s : words) {
            Set<Character> wordSet = new HashSet<>();
            for (int i = 0; i < s.length(); i++) {
                if (!allowedSet.contains(s.charAt(i))) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }

}

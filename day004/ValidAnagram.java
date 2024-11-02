package day004;

/**
 * 242. Valid Anagram
 *
 * @author created by sunjy on 11/1/24
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        int lengthS = s.length();
        int lengthT = t.length();
        if (lengthS != lengthT) {
            return false;
        }

        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            counts[c - 'a']--;
            if (counts[c - 'a'] < 0) {
                return false;
            }
        }

        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

}

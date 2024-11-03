package day005;

/**
 * 383. Ransom Note
 *
 * @author created by sunjy on 11/2/24
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] dict = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            dict[c - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (--dict[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

}

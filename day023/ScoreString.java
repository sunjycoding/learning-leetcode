package day023;

/**
 * 3110. Score of a String
 *
 * @author created by sunjy on 12/8/24
 */
public class ScoreString {

    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return score;
    }

}

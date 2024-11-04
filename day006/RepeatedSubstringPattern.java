package day006;

/**
 * 459. Repeated Substring Pattern
 *
 * @author created by sunjy on 11/3/24
 */
public class RepeatedSubstringPattern {

    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String substring = doubled.substring(1, doubled.length() - 1);
        return substring.contains(s);
    }

}

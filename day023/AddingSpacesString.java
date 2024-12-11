package day023;

/**
 * 2109. Adding Spaces to a String
 *
 * @author created by sunjy on 12/3/24
 */
public class AddingSpacesString {

    public String addSpaces(String s, int[] spaces) {
        StringBuilder stringBuilder = new StringBuilder();
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            if (p < spaces.length && spaces[p] == i) {
                stringBuilder.append(" ");
                p++;
            }
            stringBuilder.append(s.charAt(i));
        }
        return stringBuilder.toString();
    }

}

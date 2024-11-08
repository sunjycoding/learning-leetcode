package day010;

import java.util.Map;

/**
 * 13. Roman to Integer
 *
 * @author created by sunjy on 11/7/24
 */
public class RomanInteger {

    public int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentValue = map.get(s.charAt(i));
            if (i + 1 < s.length() && currentValue < map.get(s.charAt(i + 1))) {
                total -= currentValue;
            } else {
                total += currentValue;
            }
        }
        return total;
    }

}

package day014;

/**
 * 12. Integer to Roman
 *
 * @author created by sunjy on 11/11/24
 */
public class IntegerRoman {

    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            String symbol = symbols[i];

            while (num >= value) {
                num -= value;
                stringBuilder.append(symbol);
            }
        }

        return stringBuilder.toString();
    }

}

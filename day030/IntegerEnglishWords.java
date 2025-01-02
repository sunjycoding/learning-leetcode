package day030;

/**
 * 273. Integer to English Words
 *
 * @author created by sunjy on 12/21/24
 */
public class IntegerEnglishWords {

    private final String[] BELOW_TWENTY = {
            "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen"
    };
    private final String[] TENS = {
            "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };
    private final String[] THOUSANDS = {
            "", "Thousand", "Million", "Billion"
    };

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (num > 0) {
            if (num % 1000 != 0) {
                result.insert(0, helper(num % 1000) + THOUSANDS[i] + " ");
            }
            num /= 1000;
            i++;
        }

        return result.toString().trim();
    }

    private String helper(int num) {
        if (num == 0) {
            return "";
        } else if (num < 20) {
            return BELOW_TWENTY[num] + " ";
        } else if (num < 100) {
            return TENS[num / 10] + " " + helper(num % 10);
        } else {
            return BELOW_TWENTY[num / 100] + " Hundred " + helper(num % 100);
        }
    }

}

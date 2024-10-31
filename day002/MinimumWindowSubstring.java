package day002;

import java.util.HashMap;

/**
 * 76. Minimum Window Substring
 *
 * @author created by sunjy on 10/30/24
 */
public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        if (t.length() > s.length()) {
            return "";
        }
        HashMap<Character, Integer> tFreq = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            tFreq.put(c, tFreq.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> windowFreq = new HashMap<>();
        int left = 0;
        int right = 0;
        int start = 0;
        int count = 0;
        int minLength = Integer.MAX_VALUE;
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            right++;

            if (tFreq.containsKey(rightChar)) {
                windowFreq.put(rightChar, windowFreq.getOrDefault(rightChar, 0) + 1);
                if (windowFreq.get(rightChar).equals(tFreq.get(rightChar))) {
                    count++;
                }
            }

            while (count == tFreq.size()) {
                if (right - left < minLength) {
                    minLength = right - left;
                    start = left;
                }

                char leftChar = s.charAt(left);
                left++;

                if (tFreq.containsKey(leftChar)) {
                    if (windowFreq.get(leftChar).equals(tFreq.get(leftChar))) {
                        count--;
                    }
                    windowFreq.put(leftChar, windowFreq.get(leftChar) - 1);
                }
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(start, start + minLength);
    }

}

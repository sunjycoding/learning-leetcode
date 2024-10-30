package day001;

/**
 * 844. Backspace String Compare
 *
 * @author created by sunjy on 10/29/24
 */
public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        int pointerS = s.length() - 1;
        int pointerT = t.length() - 1;
        while (pointerS >= 0 || pointerT >= 0) {
            int skipS = 0;
            while (pointerS >= 0) {
                if (s.charAt(pointerS) == '#') {
                    skipS++;
                    pointerS--;
                } else if (skipS > 0) {
                    skipS--;
                    pointerS--;
                } else {
                    break;
                }
            }

            int skipT = 0;
            while (pointerT >= 0) {
                if (t.charAt(pointerT) == '#') {
                    skipT++;
                    pointerT--;
                } else if (skipT > 0) {
                    skipT--;
                    pointerT--;
                } else {
                    break;
                }
            }

            if (pointerS >= 0 && pointerT >= 0) {
                if (s.charAt(pointerS) != t.charAt(pointerT)) {
                    return false;
                }
                pointerS--;
                pointerT--;
            } else {
                return pointerS < 0 && pointerT < 0;
            }
        }
        return true;
    }

}

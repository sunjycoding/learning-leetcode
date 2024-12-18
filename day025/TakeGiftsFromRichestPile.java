package day025;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 2558. Take Gifts From the Richest Pile
 *
 * @author created by sunjy on 12/11/24
 */
public class TakeGiftsFromRichestPile {

    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int gift : gifts) {
            maxHeap.add(gift);
        }

        while (k > 0) {
            int maxGift = maxHeap.poll();
            maxHeap.add((int) Math.sqrt(maxGift));
            k--;
        }

        long sum = 0;
        for (int gift : maxHeap) {
            sum += gift;
        }
        return sum;
    }

}

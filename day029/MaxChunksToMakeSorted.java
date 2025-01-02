package day029;

/**
 * 769. Max Chunks To Make Sorted
 *
 * @author created by sunjy on 12/18/24
 */
public class MaxChunksToMakeSorted {

    public int maxChunksToSorted(int[] arr) {
        int maxSoFar = 0;
        int chunks = 0;

        for (int i = 0; i < arr.length; i++) {
            maxSoFar = Math.max(maxSoFar, arr[i]);
            if (maxSoFar == i) {
                chunks++;
            }
        }

        return chunks;
    }

}

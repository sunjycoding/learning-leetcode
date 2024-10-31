package day002;

import java.util.HashMap;

/**
 * 904. Fruit Into Baskets
 *
 * @author created by sunjy on 10/30/24
 */
public class FruitIntoBaskets {

    public int totalFruit(int[] fruits) {
        int maxFruits = 0;
        int left = 0;
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            int currentFruit = fruits[right];
            countMap.put(currentFruit, countMap.getOrDefault(currentFruit, 0) + 1);

            while (countMap.size() > 2) {
                int leftFruit = fruits[left];
                countMap.put(leftFruit, countMap.get(leftFruit) - 1);

                if (countMap.get(leftFruit) == 0) {
                    countMap.remove(leftFruit);
                }
                left++;
            }

            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }

}

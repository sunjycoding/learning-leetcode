package day028;

/**
 * 1475. Final Prices With a Special Discount in a Shop
 *
 * @author created by sunjy on 12/17/24
 */
public class FinalPricesWithSpecialDiscountShop {

    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length - 1; i++) {
            int current = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                int next = prices[j];
                if (current >= next) {
                    prices[i] = current - next;
                    break;
                }
            }
        }
        return prices;
    }

}

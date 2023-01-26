package Arrays;

public class stock_buy_sell {
    public static int stocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;//todays profit
                maxProfit = Math.max(maxProfit, profit);//max global
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int price[] = {7, 1, 5, 3, 6, 4};
        System.out.println(stocks(price));
    }
}

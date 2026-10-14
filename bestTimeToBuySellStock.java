public class bestTimeToBuySellStock{
    static int stock(int [] prices){
        int mini = prices [0];
        int maxProfit = 0;
        int n = prices.length;

        for(int i=1; i<n; i++){
            int cost = prices[i] - mini;
            maxProfit = Math.max(maxProfit, cost);
            mini = Math.min(mini, prices[i]);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices [] = {7, 1, 5, 3, 6, 4};
        System.out.println(stock(prices));
    }
}
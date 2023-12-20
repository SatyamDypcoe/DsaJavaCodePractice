public class Lc2706 {
    public static void main(String[] args) {
        int[] prices = {1,2,2};
        int money = 3;
        System.out.println(buyChoco(prices, money));
    }
    public static int buyChoco(int[] prices, int money) {
        int n = prices.length;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(prices[i] <= min1){
                min2 = min1;
                min1 = prices[i];
            }else if(prices[i] < min2){
                min2 = prices[i];
            }
        }
        int total = min1 + min2;
        if(total > money){
            return money;
        }
        return money - total;
    }
}

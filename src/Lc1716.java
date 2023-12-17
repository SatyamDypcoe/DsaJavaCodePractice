public class Lc1716 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(totalMoney(n));
    }
    public static int totalMoney(int n) {
        // Solving using ap formulae Sn = (Term/2) * (a1 + an)
        // a1 = first term = 28 (Total 7 days money)
        // an = last term; an = a1 + (term - 1) * d.  Finding total of till last weak;
        // d = common difference.
        int term = n/7;
        int a1 = 28;
        int an = 28 + (term - 1)*7;
        int total = (term*(a1 + an))/2;
        // Now finding remaining day.
        int day = n%7;
        int total1 = 0;
        int PerDayMoney = 1 + n/7;
        for(int i = 0; i < day; i++){
            total1 += PerDayMoney;
            PerDayMoney++;
        }
        return total + total1;
    }
}

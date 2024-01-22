import java.util.ArrayList;
import java.util.List;

public class Mb_BetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(4);
        List<Integer> b = new ArrayList<>();
        b.add(16);
        b.add(32);
        b.add(96);
        System.out.println(getTotalX(a, b));
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        int c = 0;
        int mul = 0;
        int n = a.size();
        int m = b.size();
        int a1 = a.get(0);
        int b1 = b.get(0);
        for(int i = 1; i < n; i++){
            a1 = lcm(a1, a.get(i));
        }
        for(int j = 1; j < m; j++){
            b1 = hcf(b1, b.get(j));
        }
        while(mul <= b1){
            mul += a1;
            if(b1%mul==0){
                c++;
            }
        }
        return c;
    }
    static int hcf(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return hcf(y, x % y);
        }
    }
        static int lcm ( int x, int y){
            if (x == 0 || y == 0)
                return 0;
            else {
                int gcd = hcf(x, y);
                return Math.abs(x * y) / gcd;
            }
        }
    }

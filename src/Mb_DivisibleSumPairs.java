import java.util.ArrayList;
import java.util.List;

public class Mb_DivisibleSumPairs {
    public static void main(String[] args) {
        int n = 6;
        int k = 3;
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(3);
        ar.add(2);
        ar.add(6);
        ar.add(1);
        ar.add(2);
        System.out.println(divisibleSumPairs(n, k, ar));
    }
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int c  = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if((ar.get(i) + ar.get(j))%k == 0){
                    c++;
                }
            }
        }
        return c;
    }
}

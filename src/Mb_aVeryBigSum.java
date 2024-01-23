import java.util.ArrayList;
import java.util.List;

public class Mb_aVeryBigSum {
    public static void main(String[] args) {
        List<Long> ar = new ArrayList<>();
        ar.add(1000000001l);
        ar.add(1000000002l);
        ar.add(1000000003l);
        ar.add(1000000004l);
        ar.add(1000000005l);
        System.out.println(aVeryBigSum(ar));
    }
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        int n =  ar.size();
        long s = 0;
        for(long val : ar){
            s += val;
        }
        return s;
    }
}

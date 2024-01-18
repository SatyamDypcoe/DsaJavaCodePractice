import java.util.ArrayList;
import java.util.List;

public class Mb_SimpleArraySum {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        System.out.println(simpleArraySum(ar));
    }
    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int n = ar.size();
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += ar.get(i);
        }
        return ans;
    }
}

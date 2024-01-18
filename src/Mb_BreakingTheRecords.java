import java.util.ArrayList;
import java.util.List;

public class Mb_BreakingTheRecords {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        scores.add(10);
        scores.add(5);
        scores.add(20);
        scores.add(20);
        scores.add(4);
        scores.add(5);
        scores.add(2);
        scores.add(25);
        scores.add(1);
        System.out.println(breakingRecords(scores));
    }
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int n = scores.size();
        List<Integer> ans = new ArrayList<>();
        int max = scores.get(0);
        int min = scores.get(0);
        int c1 = 0;
        int c2 = 0;
        for(int i = 0; i < n; i++){
            if(scores.get(i) > max){
                max = scores.get(i);
                c1++;
            }
            if(scores.get(i) < min){
                min = scores.get(i);
                c2++;
            }
        }
        ans.add(c1);
        ans.add(c2);
        return ans;
    }
}

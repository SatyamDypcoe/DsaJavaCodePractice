import java.util.ArrayList;
import java.util.List;

public class Mb_SubarrayDivision {
    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);
        int d = 3;
        int m = 2;
        System.out.println(birthday(s, d, m));
    }
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int n = s.size();
        int c = 0;
        for(int i = 0; i <= n-m; i++){
            int sum = 0;
            for(int j = i; j < m+i; j++){
                sum += s.get(j);
            }
            if(sum == d){
                c++;
            }
        }
        return c;
    }
}

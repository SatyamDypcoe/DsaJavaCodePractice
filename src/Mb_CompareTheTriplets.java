import java.util.ArrayList;
import java.util.List;

public class Mb_CompareTheTriplets {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(17);
        a.add(28);
        a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(99);
        b.add(16);
        b.add(8);
        System.out.println(compareTriplets(a,b));
    }
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> ans = new ArrayList<>();
        int alice = 0;
        int bob = 0;
        int n = a.size();
        for(int i = 0; i < n; i++){
            if(a.get(i) > b.get(i)){
                alice++;
            }
            if(b.get(i) > a.get(i)){
                bob++;
            }
        }
        ans.add(alice);
        ans.add(bob);
        return ans;
    }

}

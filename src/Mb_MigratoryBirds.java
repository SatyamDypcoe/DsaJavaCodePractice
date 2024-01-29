import java.util.ArrayList;
import java.util.List;

public class Mb_MigratoryBirds {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        System.out.println(migratoryBirds(arr));
    }
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        int[] count = new int[6];
        int max = 0;
        int ans = 0;
        for(int i = 0; i < n; i++){
            count[arr.get(i)]++;
        }
        for(int i = 0; i < 6; i++){
            if(count[i] > max){
                max = count[i];
                ans = i;
            }
        }
        return ans;
    }
}

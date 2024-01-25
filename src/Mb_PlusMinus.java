import java.util.ArrayList;
import java.util.List;

public class Mb_PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
        plusMinus(arr);
    }
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float n = arr.size();
        int z = 0;
        int p = 0;
        int neg = 0;
        for(int i : arr){
            if(i == 0){
                z++;
            }
            if(i > 0){
                p++;
            }
            if(i < 0){
                neg++;
            }
        }
        float zero = z/n;
        float pos = p/n;
        float negative = neg/n;
        System.out.printf("%.6f",pos);
        System.out.println();
        System.out.printf("%.6f",negative);
        System.out.println();
        System.out.printf("%.6f",zero);
    }
}

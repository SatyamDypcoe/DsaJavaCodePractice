import java.util.ArrayList;
import java.util.List;

public class Mb_Quicksort1Partition {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(5);
        arr.add(3);
        arr.add(7);
        arr.add(2);
        System.out.println(quickSort(arr));
    }
    public static List<Integer> quickSort(List<Integer> arr) {
        // Write your code here
        List<Integer> left = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int p = arr.get(0);
        int n = arr.size();
        for(int i = 0; i < n; i++){
            if(arr.get(i) == p){
                equal.add(arr.get(i));
            }
            if(arr.get(i) < p){
                left.add(arr.get(i));
            }
            if(arr.get(i) > p){
                right.add(arr.get(i));
            }
        }
        ans.addAll(left);
        ans.addAll(equal);
        ans.addAll(right);
        return ans;
    }
}

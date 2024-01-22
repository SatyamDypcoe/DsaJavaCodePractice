import java.util.ArrayList;
import java.util.List;

public class Mb_BillDivision {
    public static void main(String[] args) {
        int k = 1;
        int b = 12;
        List<Integer> bill = new ArrayList<>();
        bill.add(3);
        bill.add(10);
        bill.add(2);
        bill.add(9);
        bonAppetit(bill, k, b);
    }
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int n = bill.size();
        int s = 0;
        for(int i = 0; i < n; i++){
            s += bill.get(i);
        }
        s = s - bill.get(k);
        s = s/2;
        if(s == b){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b-s);
        }
    }
}

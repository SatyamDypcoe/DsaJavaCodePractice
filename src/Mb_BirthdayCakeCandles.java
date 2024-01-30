import java.util.ArrayList;
import java.util.List;

public class Mb_BirthdayCakeCandles {
    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();
        candles.add(3);
        candles.add(2);
        candles.add(1);
        candles.add(3);
        System.out.println(birthdayCakeCandles(candles));
    }
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int n = candles.size();
        int c = 0;
        int max = 0;
        for(int i  = 0; i < n; i++){
            if(candles.get(i) > max){
                max = candles.get(i);
                c = 1;
            }
            else if(candles.get(i) == max){
                c++;
            }
        }
        return c;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Mb_DiagonalDifference {
    public static void main(String[] args) {
        int[][] arr ={
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };
        System.out.println(diagonalDifference(arr));
    }
    public static int diagonalDifference(int[][] arr) {
        // Write your code here
        int n = arr.length;
        int d1 = 0;
        int d2 = 0;
        for(int i = 0; i< n; i++){
            d1 += arr[i][i];
            d2 += arr[i][n-1-i];
        }
        return Math.abs(d1-d2);
    }
}

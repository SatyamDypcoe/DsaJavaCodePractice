import java.util.Arrays;

public class Lc1637 {
    public static void main(String[] args) {
        int[][] points = {
                {8,7},
                {9,9},
                {7,4},
                {9,7}
        };
        System.out.println(maxWidthOfVerticalArea(points));
    }
    public static int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        Arrays.sort(points,(a, b) -> Integer.compare(a[0], b[0]));
        int maxDis = 0;
        for(int i = 1; i < n; i++){
            int d = points[i][0] - points[i - 1][0];
            maxDis = Math.max(maxDis, d);
        }
        return maxDis;
    }
}

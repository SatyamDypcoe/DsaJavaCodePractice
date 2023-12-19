import java.util.Arrays;

public class Lc661 {
    public static void main(String[] args) {
        int[][] img = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        System.out.println(Arrays.deepToString(imageSmoother(img)));
    }
    private static final int[][] neigh = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1}, {0, 0}, {0, 1},
            {1, -1}, {1, 0}, {1, 1}
    };
    public static int[][] imageSmoother(int[][] img) {
        int n = img.length;
        int m = img[0].length;
        int[][] ans = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                int sum = 0;
                int c = 0;
                for(int[] dir : neigh){
                    int ii = i + dir[0];
                    int jj = j + dir[1];
                    if(ii >= 0 && ii < n && jj >= 0 && jj < m){
                        sum += img[ii][jj];
                        c++;
                    }
                }
                ans[i][j] = sum/c;
            }
        }
        return ans;
    }
}

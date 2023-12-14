import java.util.Arrays;

public class Lc2482 {
    public static void main(String[] args) {
        int[][] grid = {
                {0,1,1},
                {1,0,1},
                {0,0,1}
        };
        System.out.println(Arrays.deepToString(onesMinusZeros(grid)));
    }
    public static int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] rowones = new int[n]; //New arr for counting all ones in row.
        int[] colones = new int[m]; //New arr for counting all ones in coll.
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    rowones[i]++;
                    colones[j]++;
                }
            }
        }
        for(int i =0; i < n; i++){
            for(int j = 0; j < m; j++){
                grid[i][j] = rowones[i] + colones[j] -(n - rowones[i]) - (m - colones[j]);
            }
        }
        return grid;
    }
}

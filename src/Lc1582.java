public class Lc1582 {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 0 ,0},
                {0, 1, 0},
                {0, 0, 1}
        };
        System.out.println(numSpecial(mat));
    }
    public static int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 1){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int c = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 1 && row[i] == 1 && col[j] == 1){
                    c++;
                }
            }
        }

        return c;
    }
}

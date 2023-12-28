import java.util.Arrays;

public class Lc1531 {
    public static void main(String[] args) {
        String s = "aaabcccd";
        int k = 2;
        System.out.println(getLengthOfOptimalCompression(s, k));
    }
    private static int n;
    private static int[][] t;

    public static int solve(int i, int k, String s) {
        if (k < 0) {
            return 100000;
        }

        if (i >= n || (n - i) <= k) {
            return 0;
        }

        if (t[i][k] != -1) {
            return t[i][k];
        }

        int delete_i = solve(i + 1, k - 1, s);

        int keep_i = Integer.MAX_VALUE;

        int deleted = 0;
        int freq = 0;
        int addition = 0;

        for (int j = i; j < n && deleted <= k; j++) {
            if (s.charAt(j) == s.charAt(i)) {
                freq++;
                if (freq == 2 || freq == 10 || freq == 100) {
                    addition++;
                }
            } else {
                deleted++;
            }

            keep_i = Math.min(keep_i, 1 + addition + solve(j + 1, k - deleted, s));
        }

        return t[i][k] = Math.min(delete_i, keep_i);
    }
    public static int getLengthOfOptimalCompression(String s, int k) {
        n = s.length();
        t = new int[n + 1][k + 1];
        for (int[] row : t) {
            Arrays.fill(row, -1);
        }
        return solve(0, k, s);

    }
}

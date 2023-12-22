public class Lc1422BruteForce {
    public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore(s));
    }
    public static int maxScore(String s) {
        int n = s.length();
        int ans = 0;
        int zero = 0;
        for(int i = 0; i < n-1; i++){
            int one = 0;
            if(s.charAt(i) == '0'){
                zero++;
            }
            for(int j = i + 1; j < n; j++){
                if(s.charAt(j) == '1'){
                    one++;
                }
            }
            ans = Integer.max(ans, one+zero);
        }
        return ans;
    }
}

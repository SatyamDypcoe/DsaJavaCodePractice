public class Lc1422 {
    public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore(s));
    }
    public static int maxScore(String s) {
        int n = s.length();
        int one = 0;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == '1'){
                one++;
            }
        }
        int zero = 0;
        for(int i = 0; i < n-1; i++){
            if(s.charAt(i) == '0'){
                zero++;
            }else{
                one = one -1;
            }
            ans = Integer.max(ans, one+zero);
        }
        return ans;
    }
}

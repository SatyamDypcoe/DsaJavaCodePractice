public class Lc1758Microsoft {
    public static void main(String[] args) {
        String s = "1111";
        System.out.println(minOperations(s));
    }
    public static int minOperations(String s) {
        int n = s.length();
        int start_with_0 = 0;
        for(int i = 0; i < n; i++){
            if(i%2 == 0){            //Comparing 0101 with original string.
                if(s.charAt(i) == '0'){
                    start_with_0++;
                }
            }else if(i % 2 == 1){
                if(s.charAt(i) == '1'){
                    start_with_0++;
                }
            }
        }
        return Integer.min(start_with_0, n - start_with_0);
    }
}

public class Lc2125 {
    public static void main(String[] args) {
        String[] bank = {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }
    public static int numberOfBeams(String[] bank) {
        int n = bank.length;
        int m = bank[0].length();
        int ans = 0;
        int prevOne = 0;
        for(int i = 0; i < n; i++){
            int c1 = 0;
            for(int j = 0; j < m; j++){
                if(bank[i].charAt(j) == '1'){
                    c1++;
                }
            }
            ans += c1* prevOne;
            if(c1 != 0){
                prevOne = c1;
            }
        }
        return ans;
    }
}

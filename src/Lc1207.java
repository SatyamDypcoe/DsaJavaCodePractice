import java.util.Arrays;

public class Lc1207 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        int[] ans = new int[2001];
        int n = arr.length;
        for(int i = 0; i < n; i++){
            ans[1000 + arr[i]]++;
        }
        Arrays.sort(ans);
        for(int i = 1; i < 2001; i++){
            if(ans[i] != 0 && ans[i] == ans[i-1]){
                return false;
            }
        }
        return true;
    }
}

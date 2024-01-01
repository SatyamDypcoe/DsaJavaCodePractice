import java.util.Arrays;

public class Lc455 {
    public static void main(String[] args) {
        int[] s = {1,2,3};
        int[] g = {1,2};
        System.out.println(findContentChildren(g, s));
    }
    public static int findContentChildren(int[] g, int[] s) {
        int n = g.length;
        int m = s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int c = 0;
        int i = 0;
        int j = 0;
        while(i < n && j < m){
            if(s[j] >= g[i]){
                c++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return c;
    }
}

import java.util.Arrays;

public class Lc1657 {
    public static void main(String[] args) {
        String word1 = "cabbba";
        String word2 = "abbccc";
        System.out.println(closeStrings(word1, word2));
    }
    public static boolean closeStrings(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        if(m != n){
            return false;
        }
        int[] w1 = new int[26];
        int[] w2 = new int[26];
        for(int i = 0; i < n; i++){
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            w1[c1 - 'a']++;
            w2[c2 - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if((w1[i] != 0 && w2[i] != 0) || (w1[i] == 0 && w2[i] == 0)){
                continue;
            }else{
                return false;
            }
        }
        Arrays.sort(w1);
        Arrays.sort(w2);
        for(int i = 0; i < 26; i++){
            if(w1[i] != w2[i]){
                return false;
            }
        }
        return true;
    }
}

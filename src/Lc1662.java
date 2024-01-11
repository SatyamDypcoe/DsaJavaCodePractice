public class Lc1662 {
    public static void main(String[] args) {
        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int n = word1.length;
        int m = word2.length;
        String s1 = "";
        String s2 = "";
        for(int i = 0; i < n; i++){
            s1 += word1[i];
        }
        for(int j = 0; j < m; j++){
            s2 += word2[j];
        }
        System.out.println(s1);
        System.out.println(s2);
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}

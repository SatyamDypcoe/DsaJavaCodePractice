public class Lc1897 {
    public static void main(String[] args) {
        String[] words = {"abc","aabc","bc"};
        System.out.println(makeEqual(words));
    }
    public static boolean makeEqual(String[] words) {
        int n = words.length;
        int[] arr = new int[26];
        for(int i = 0; i < n; i++){
            int m = words[i].length();
            for(int j =0; j < m; j++){
                arr[words[i].charAt(j) - 'a']++;
            }
        }
        for(int i = 0; i < 26; i++){
            if(arr[i]%n != 0){
                return false;
            }
        }
        return true;
    }
}

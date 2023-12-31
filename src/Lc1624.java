import java.util.HashMap;

public class Lc1624 {
    public static void main(String[] args) {
        String s = "abcda";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }
    public static int maxLengthBetweenEqualCharacters(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = -1;
        for(int i = 0; i < n; i++){
            if(map.containsKey(s.charAt(i))){
                ans = Math.max(ans, i-map.get(s.charAt(i))-1);
            }else{
                map.put(s.charAt(i), i);
            }
        }
        return ans;
    }
}

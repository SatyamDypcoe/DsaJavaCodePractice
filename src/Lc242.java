import java.util.HashMap;

public class Lc242 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
    public static boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(m != n){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(s.charAt(i))){
                int freq = map.get(s.charAt(i));
                map.put(s.charAt(i), freq + 1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        for(char x : t.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) - 1);
        }
        for(int val : map.values()){
            if(val != 0){
                return false;
            }
        }
        return true;
    }
}

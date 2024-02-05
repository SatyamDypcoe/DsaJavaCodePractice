import java.util.HashMap;

public class Lc387 {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch, freq + 1);
            }else{
                map.put(ch, 1);
            }
        }
        for(int i = 0; i < n; i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}

import java.util.HashMap;

public class Lc1347 {
    public static void main(String[] args) {
        String s = "leetcode";
        String t = "practice";
        System.out.println(minSteps(s, t));
    }
    public static int minSteps(String s, String t) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        int c = 0;
        for(int i = 0; i < n; i++){
            if(map.containsKey(s.charAt(i))){
                int freq = map.get(s.charAt(i));
                map.put(s.charAt(i), freq + 1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        for(int j = 0; j < n; j++){
            if(map.containsKey(t.charAt(j))){
                int fre = map.get(t.charAt(j));
                map.put(t.charAt(j), fre - 1);
            }
        }
        for(int val : map.values()){
            if(val > 0){
                c += val;
            }
        }
        return c;
    }
}

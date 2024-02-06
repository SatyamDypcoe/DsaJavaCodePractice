import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lc49 {
    public static void main(String[] args) {
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    private static String generate(String s) {
        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        StringBuilder newS = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                newS.append(String.valueOf((char) (i + 'a')).repeat(count[i]));
            }
        }

        return newS.toString();
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            String newS = generate(s);

            if (!map.containsKey(newS)) {
                map.put(newS, new ArrayList<>());
            }

            map.get(newS).add(s);
        }

        return new ArrayList<>(map.values());
    }
}

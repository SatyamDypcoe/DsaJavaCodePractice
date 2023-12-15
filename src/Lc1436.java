import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Lc1436 {
    public static void main(String[] args) {
        ArrayList<ArrayList<String> > paths = new ArrayList<ArrayList<String> >();
        paths.add(new ArrayList<String>(Arrays.asList("B", "C")));
//        paths.get(0).add(0, "B");
//        paths.get(0).add(1, "C");
        paths.add(new ArrayList<String>(Arrays.asList("D", "B")));
        paths.add(new ArrayList<String>(Arrays.asList("C", "A")));
        System.out.println(destCity(paths));
    }
    public static String destCity(ArrayList<ArrayList<String>> paths) {
        String ans = "";
        int n = paths.size();
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            map.put(paths.get(i).get(0),paths.get(i).get(1));
        }
        for(String Start : map.keySet()){
            String dest = map.get(Start);
            if(!map.containsKey(dest)){
                ans = dest;
            }
        }
        return ans;
    }
}

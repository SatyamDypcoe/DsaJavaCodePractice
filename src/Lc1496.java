import java.util.HashSet;

public class Lc1496 {
    public static void main(String[] args) {
        String path = "NESWW";
        System.out.println(isPathCrossing(path));
    }
    public static boolean isPathCrossing(String path) {
        int n = path.length();
        int x = 0;
        int y = 0;
        HashSet<String> set = new HashSet<>();
        String key = x+" "+y;
        set.add(key);
        for(int i = 0; i < n; i++){
            if(path.charAt(i) == 'E'){
                x++;
            }else if(path.charAt(i) == 'W'){
                x--;
            }else if(path.charAt(i) == 'N'){
                y++;
            }else if(path.charAt(i) == 'S'){
                y--;
            }

            key = x+" "+y;
            if(set.contains(key)){
                return true;
            }else{
                set.add(key);
            }
        }
        return false;
    }
}

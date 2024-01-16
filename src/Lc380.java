import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Lc380 {
    public static void main(String[] args) {

    }
    ArrayList<Integer> list = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    public static Random random;
    public static void RandomizedSet() {
        random = new Random();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }else{
            list.add(val);
            map.put(val, list.size() - 1);
            return true;
        }
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int ind = map.get(val);
        int lastEle = list.get(list.size() - 1);
        list.set(ind, lastEle);
        map.put(lastEle, ind);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        int ind = random.nextInt(list.size());
        return list.get(ind);
    }
}

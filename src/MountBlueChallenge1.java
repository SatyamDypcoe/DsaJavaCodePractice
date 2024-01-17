import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
//
//Example
// n = 7
//ar = [1, 2, 1, 2, 1, 3, 2]
//There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.
//
//Function Description
//
//Complete the sockMerchant function in the editor below.
//
//sockMerchant has the following parameter(s):
//
//int n: the number of socks in the pile
//int ar[n]: the colors of each sock
//Returns
//
//int: the number of pairs
public class MountBlueChallenge1 {
    public static void main(String[] args) {
        int n = 7;
        List<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(2);
        ar.add(1);
        ar.add(3);
        ar.add(2);
        System.out.println(sockMerchant(n, ar));
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(ar.get(i))){
                int freq = map.get(ar.get(i));
                map.put(ar.get(i), freq + 1);
            }else{
                map.put(ar.get(i), 1);
            }
        }
        for(int val : map.values()){
            ans += val/2;
        }
        return ans;
    }
}

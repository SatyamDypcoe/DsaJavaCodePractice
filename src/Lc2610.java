import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lc2610 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,1,2,3,1};
        System.out.println(findMatrix(nums));
    }
    public static List<List<Integer>> findMatrix(int[] nums) {
        int n = nums.length;
        int[] mp = new int[n +1];
        ArrayList<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int freq = mp[nums[i]];
            if(freq == ans.size()){
                ans.add(new ArrayList<>());
            }
            ans.get(freq).add(nums[i]);
            mp[nums[i]]++;
        }
        return ans;
    }
}

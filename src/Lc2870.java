import java.util.HashMap;

public class Lc2870 {
    public static void main(String[] args) {
        int[] nums ={2,3,3,2,2,4,2,3,4};
        System.out.println(minOperations(nums));
    }
    public static int minOperations(int[] nums) {
        int n = nums.length;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                map.put(nums[i], freq + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(int num : map.values()){
            if(num == 1){
                return -1;
            }else{
                ans += Math.ceil((double)num/3);
            }
        }
        return ans;
    }
}

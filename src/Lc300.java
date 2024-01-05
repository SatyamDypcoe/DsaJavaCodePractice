import java.util.ArrayList;

public class Lc300 {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int ind = binarySearch(ans, nums[i]);
            if(ind == ans.size()){
                ans.add(nums[i]);
            }else{
                ans.set(ind, nums[i]);
            }
        }
        return ans.size();
    }
    private static int binarySearch(ArrayList<Integer> ans, int target){
        int s = 0;
        int e = ans.size();
        int result = ans.size();
        while(s < e){
            int mid = s + (e-s)/2;
            if(ans.get(mid) < target){
                s = mid + 1;
            }else{
                result = mid;
                e = mid;
            }
        }
        return result;
    }
}

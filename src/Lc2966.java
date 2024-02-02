import java.util.Arrays;

public class Lc2966 {
    public static void main(String[] args) {
        int[] nums = {1,3,4,8,7,9,3,5,1};
        int k = 2;
        System.out.println(Arrays.deepToString(divideArray(nums, k)));
    }
    public static int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int ind = 0;
        int[][] ans = new int[n/3][3];
        Arrays.sort(nums);
        for(int i = 0; i < n-2; i += 3){
            if(nums[i + 2] - nums[i] > k){
                return new int[0][0];
            }
            ans[ind][0] = nums[i];
            ans[ind][1] = nums[i+1];
            ans[ind][2] = nums[i+2];
            ind++;
        }
        return ans;
    }
}

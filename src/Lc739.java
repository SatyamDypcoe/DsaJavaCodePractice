import java.util.Arrays;
import java.util.Stack;

public class Lc739 {
    public static void main(String[] args) {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = 0;
            }else{
                ans[i] = st.peek() -i;
            }
            st.push(i);
        }
        return ans;
    }
}

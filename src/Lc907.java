import java.util.Stack;

public class Lc907 {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(sumSubarrayMins(arr));
    }
    public static int[] getNsl(int[] arr, int n){
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()]> arr[i]){
                st.pop();
            }
            result[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return result;
    }
    public static int[] getNsr(int[] arr, int n){
        int result[]= new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && arr[st.peek()]>= arr[i]){
                st.pop();
            }
            result[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return result;
    }
    public static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] Nsl = getNsl(arr, n);
        int[] Nsr = getNsr(arr, n);
        long s = 0;
        int m = 1000000007;
        for(int i = 0; i < n; i++){
            long d1 = i - Nsl[i];
            long d2 = Nsr[i] - i;
            long totalWays = d1*d2;
            long totalSum = arr[i]*totalWays;
            s = (s + totalSum)%m;
        }
        return (int)s;
    }
}

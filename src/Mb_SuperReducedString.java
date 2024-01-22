import java.util.Stack;

public class Mb_SuperReducedString {
    public static void main(String[] args) {
        String s = "aaabccddd";
        System.out.println(superReducedString(s));
    }
    public static String superReducedString(String s) {
        // Write your code here
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == st.peek()){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        String ans = "";
        for(Character val : st){
            ans += val;
        }
        if(ans.length() == 0){
            return "Empty String";
        }
        return ans;
    }
}

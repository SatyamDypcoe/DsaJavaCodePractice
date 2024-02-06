//Given a string A consisting only of '(' and ')'.
//
//You need to find whether parentheses in A are balanced or not, if it is balanced then return 1 else return 0.
//
//
//
//Problem Constraints
//1 <= |A| <= 105
//
//
//
//Input Format
//First argument is an string A.
//
//
//
//Output Format
//Return 1 if parantheses in string are balanced else return 0.
//
//
//
//Example Input
//Input 1:
//
// A = "(()())"
//Input 2:
//
// A = "(()"
//
//
//Example Output
//Output 1:
//
// 1
//Output 2:
//
// 0
import java.util.Stack;

public class BalancedParantheses {
    public static void main(String[] args) {
        String A = "(()())";
        System.out.println(solve(A));
    }
    public static int solve(String A) {
        int n = A.length();
        Stack<Character> st = new Stack<>();
        for(char ch : A.toCharArray()){
            if(ch == '(' || ch == '{' || ch== '['){
                st.push(ch);
            }else{
                if(st.isEmpty()){
                    return 0;
                }else{
                    if((ch== ')') && st.peek() == '('){
                        st.pop();
                    }
                    if((ch== '}') && st.peek() == '{'){
                        st.pop();
                    }
                    if((ch== ']') && st.peek() == '['){
                        st.pop();
                    }
                }
            }
        }
        if(!st.isEmpty()){
            return 0;
        }
        return 1;
    }
}

//Little Ponny has been given a string A, and he wants to find out the lexicographically minimum subsequence from it of size >= 2. Can you help him?
//
//A string a is lexicographically smaller than string b, if the first different letter in a and b is smaller in a. For example, "abc" is lexicographically smaller than "acc" because the first different letter is 'b' and 'c' which is smaller in "abc".
//
//Problem Constraints
//
//1 <= |A| <= 105
//
//A only contains lowercase alphabets.
//
//
//
//Input Format
//
//The first and the only argument of input contains the string, A.
//
//
//
//Output Format
//
//Return a string representing the answer.
//
//
//
//Example Input
//
//Input 1:
//
// A = "abcdsfhjagj"
//Input 2:
//
// A = "ksdjgha"
//
//
//Example Output
//
//Output 1:
//
// "aa"
//Output 2:
//
// "da"
public class LittlePonnyAnd2Subsequence {
    public static void main(String[] args) {
        String A = "abcdsfhjagj";
        System.out.println(solve(A));
    }
        public static String solve(String A) {
            int n = A.length();
            int ind = Integer.MAX_VALUE;
            char minChar = 'z';
            char minChar2 = 'z';
            String ans = "";
            for(int i = 0; i < n-1; i++){
                if(A.charAt(i) < minChar){
                    minChar = A.charAt(i);
                    ind = i;
                }
            }
            for(int i = ind+1; i < n; i++){
                if(A.charAt(i) < minChar2){
                    minChar2 = A.charAt(i);
                }
            }
            ans = String.valueOf(minChar) + String.valueOf(minChar2);
            return ans;
        }
}

public class Lc1704 {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }
    public static boolean halvesAreAlike(String s) {
        int n = s.length();
        int c1= 0;
        int c2 = 0;
        int m = n/2;
        for(int i = 0; i < n/2; i++){
            if(s.charAt(i) == 'a'|| s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'){
                c1++;
            }
            if(s.charAt(m+i) == 'a'|| s.charAt(m+i) == 'e'||s.charAt(m+i) == 'i'||s.charAt(m+i) == 'o'||s.charAt(m+i) == 'u'){
                c2++;
            }
            if(s.charAt(i) == 'A'|| s.charAt(i) == 'E'||s.charAt(i) == 'I'||s.charAt(i) == 'O'||s.charAt(i) == 'U'){
                c1++;
            }
            if(s.charAt(m+i) == 'A'|| s.charAt(m+i) == 'E'||s.charAt(m+i) == 'I'||s.charAt(m+i) == 'O'||s.charAt(m+i) == 'U'){
                c2++;
            }
        }
        if(c1 == c2){
            return true;
        }
        return false;
    }
}

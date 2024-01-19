public class Mb_NumberLineJumps {
    public static void main(String[] args) {
        int x1 = 2;
        int v1 = 1;
        int x2 = 1;
        int v2 = 2;
        System.out.println(kangaroo(x1,v1,x2,v2));
    }
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        int d = x2 - x1;
        if((v1 > v2) && d%(v1-v2)== 0){
            return "YES";
        }
        return "NO";
    }
}

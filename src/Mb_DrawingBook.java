public class Mb_DrawingBook {
    public static void main(String[] args) {
        int n = 6;
        int p = 2;
        System.out.println(pageCount(n, p));
    }
    public static int pageCount(int n, int p) {
        // Write your code here
        int f = p/2;
        int b = n/2 - f;
        return Math.min(f,b);
    }
}

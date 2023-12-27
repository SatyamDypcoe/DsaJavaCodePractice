public class Lc1578 {
    public static void main(String[] args) {
        String colors = "aabaa";
        int[] neededTime = {1,2,3,4,1};
        System.out.println(minCost(colors, neededTime));
    }
    public static int minCost(String colors, int[] neededTime) {
        int n = colors.length();
        int prev = 0;
        int time = 0;
        for(int i = 0; i < n; i++){
            if( i > 0 && colors.charAt(i) != colors.charAt(i - 1)){
                prev = 0;
            }
            int curr = neededTime[i];
            time += Math.min(prev, curr);
            prev = Math.max(prev, curr);
        }
        return time;
    }
}

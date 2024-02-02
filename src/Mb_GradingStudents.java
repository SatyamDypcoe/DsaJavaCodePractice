import java.util.ArrayList;
import java.util.List;

public class Mb_GradingStudents {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        System.out.println(gradingStudents(grades));
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        int n = grades.size();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(grades.get(i) < 38){
                ans.add(grades.get(i));
            }
            else if(grades.get(i)%5 > 2){
                int m = grades.get(i) +  (5 -grades.get(i)%5);
                ans.add(m);
            }else{
                ans.add(grades.get(i));
            }
        }
        return ans;
    }
}

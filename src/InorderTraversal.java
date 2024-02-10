import javax.swing.tree.TreeNode;
import java.util.ArrayList;

public class InorderTraversal {
    public static void main(String[] args) {

    }
    public static class Solution {
        ArrayList<Integer> ans = new ArrayList<>();
        public static ArrayList<Integer> inorderTraversal(TreeNode A) {
            if(A == null){
                return ans;
            }
            inorderTraversal(A.left);
            ans.add(A.val);
            inorderTraversal(A.right);
            return ans;
        }
}

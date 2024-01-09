import javax.swing.tree.TreeNode;

public class Lc872 {
    public static void main(String[] args) {

    }
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        checkLeaf(root1, s1);
        checkLeaf(root2, s2);

        if(s1.toString().equals(s2.toString())){
            return true;
        }
        return false;
    }
    private static void checkLeaf(TreeNode root, StringBuilder s){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            s.append(root.val).append("a");
            return;
        }
        checkLeaf(root.left, s);
        checkLeaf(root.right, s);
    }
}

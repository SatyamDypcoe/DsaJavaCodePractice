import javax.swing.tree.TreeNode;

public class Lc872 {
    public static void main(String[] args) {
        BinarySearchTree root1 = new BinarySearchTree();

        // Inserting nodes
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);
    }
    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    class BinarySearchTree {
        Node root;

        // Constructor
        BinarySearchTree() {
            root = null;
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

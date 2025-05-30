import javax.swing.tree.TreeNode;

public class LeetCode951 {
    public static boolean check(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null || node1.val != node2.val) {
            return false;
        }

        return (check(node1.left, node2.left) || check(node1.left, node2.right)) &&
               (check(node1.right, node2.right) || check(node1.right, node2.left));
    }

    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return check(root1, root2);
    }
}

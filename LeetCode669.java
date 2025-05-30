public class LeetCode669 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        //if the range is correct then checking both root left and right
        if (root.val >= low && root.val <= high) {
            root.left = trimBST(root.left, low, high);//Trim the left subtree
            root.right = trimBST(root.right, low, high);//Trim the right subtree
        } else if (root.val < low) {
            //if the root val is less than low then getting values from left will be even lower(binary tree rule) so we need to set the root to root.right;
            root = trimBST(root.right, low, high);
        } else if (root.val > high) {
            //if the root val is greater than high then getting values from right will be even higher(binary tree rule) so we need to the root to root.left.
            root = trimBST(root.left, low, high);
        }
        return root;
    }
}

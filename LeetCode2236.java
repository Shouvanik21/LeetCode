public class LeetCode2236{
    public boolean checkTree(TreeNode root) {
        return (root.val==root.left.val+root.right.val)?true:false;
    }
}
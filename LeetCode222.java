public class LeetCode222 {
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        int leftTree=countNodes(root.left);
        int rightTree=countNodes(root.right);

        return leftTree+rightTree+1;
    }
}

public class LeetCode1038 {
    private int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        if(root!=null){
            bstToGst(root.right);//traverse the right side
            sum+=root.val;
            root.val=sum;
            bstToGst(root.left);//traverse the left side
        }
        return root;
    }
}

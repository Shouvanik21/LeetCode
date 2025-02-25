public class LeetCode110{
    public static int maxHeight(TreeNode root){
        if(root==null){
            return 0;
        }

        int left=maxHeight(root.left);
        if(left==-1){
            return -1;
        }

        int right=maxHeight(root.right);
        if(right==-1){
            return -1;
        }


        if(Math.abs(left-right)>1){
            return -1;
        }

        return 1+Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        return maxHeight(root)!=-1;
    }
}
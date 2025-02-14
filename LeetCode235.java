public class LeetCode235{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        int temp=root.val;
        if(p.val<temp && q.val<temp){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(p.val>temp && q.val>temp){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
}
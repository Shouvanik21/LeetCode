public class LeetCode1008{
    public static TreeNode insert(TreeNode root,int ele){
        if(root==null){
            return new TreeNode(ele);
        }
        if(ele<root.val){
            root.left=insert(root.left,ele);
        }
        if(ele>root.val){
            root.right=insert(root.right,ele);
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int i=0;i<preorder.length;i++){
            root=insert(root,preorder[i]);
        }
        return root;
    }
}
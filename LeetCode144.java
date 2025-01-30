public class LeetCode144{
    public static void preOrder(TreeNode root,ArrayList<Integer> ls){
        if(root==null){
            return;
        }
        ls.add(root.val);
        preOrder(root.left,ls);
        preOrder(root.right,ls);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ls=new ArrayList<>();
        preOrder(root,ls);
        return ls;
    }
}
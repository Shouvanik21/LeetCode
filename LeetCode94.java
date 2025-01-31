public class LeetCode94{
    public static void inOrder(TreeNode root,ArrayList<Integer>ls){
        if(root==null){
            return;
        }
        inOrder(root.left,ls);
        ls.add(root.val);
        inOrder(root.right,ls);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ls=new ArrayList<>();
        inOrder(root,ls);
        return ls;
    }
}
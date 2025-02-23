public class LeetCode1305{
    public static List<Integer> inOrderTraversal(TreeNode root,List<Integer> ls){
        if(root==null){
            return ls;
        }
        inOrderTraversal(root.left,ls);
        ls.add(root.val);
        inOrderTraversal(root.right,ls);
        return ls;
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ls=new ArrayList<>();
        ls=inOrderTraversal(root1,ls);
        ls=inOrderTraversal(root2,ls);
        Collections.sort(ls);
        return ls;
    }
}
public class LeetCode98{
    public static ArrayList<Integer> inOrderTraversal(TreeNode root,ArrayList<Integer>ls){
        if(root==null){
            return ls;
        }
        inOrderTraversal(root.left,ls);
        ls.add(root.val);
        inOrderTraversal(root.right,ls);
        return ls;
    }
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> ls=inOrderTraversal(root,new ArrayList<>());
        for(int i=1;i<ls.size();i++){
            if(ls.get(i-1)>=ls.get(i)){
                return false;
            }
        }
        return true;
    }
}
public class LeetCode897 {
    public static ArrayList<Integer> inOrder(ArrayList<Integer> ans,TreeNode root){
        if(root==null){
            return ans;
        }
        inOrder(ans,root.left);
        ans.add(root.val);
        inOrder(ans,root.right);
        return ans;
    }
    public static TreeNode solveAns(ArrayList<Integer> ans,int index){
        if(index>=ans.size()){
            return null;
        }
        TreeNode root=new TreeNode(ans.get(index));
        root.right=solveAns(ans,index+1);
        return root;
    }
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        inOrder(ans,root);
        return solveAns(ans,0);
    }
}

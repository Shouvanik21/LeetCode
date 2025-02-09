import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class LeetCode230 {
    public static ArrayList<Integer> inOrderTraversal(TreeNode root,ArrayList<Integer> ans){
        if(root==null){
            return ans;
        }
        inOrderTraversal(root.left,ans);
        ans.add(root.val);
        inOrderTraversal(root.right,ans);
        return ans;
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ls=inOrderTraversal(root,new ArrayList<>());
        return ls.get(k-1);
    }
}

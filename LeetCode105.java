import java.util.HashMap;
import java.util.Map;

import javax.swing.tree.TreeNode;

public class LeetCode105{
    private int preorderIndex;
    private Map<Integer, Integer> mapping;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        mapping = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            mapping.put(inorder[i], i);
        }

        int preorderIndex = 0;
        return build(preorder, 0, inorder.length - 1);     
    }
    private TreeNode build(int[] preorder, int start, int end) {
        if (start > end){
            return null;
        }    

        int rootVal = preorder[preorderIndex++];
        TreeNode root = new TreeNode(rootVal);
        int mid = mapping.get(rootVal);

        root.left = build(preorder, start, mid - 1);
        root.right = build(preorder, mid + 1, end);

        return root;
    }
}
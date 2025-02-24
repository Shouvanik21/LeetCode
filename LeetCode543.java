public class LeetCode543{
    public static int height(TreeNode root,int arr[]){
        if(root==null){
            return 0;
        }
        int left=height(root.left,arr);
        int right=height(root.right,arr);
        arr[0]=Math.max(arr[0],left+right);
        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int ans[]=new int[1];
        height(root,ans);
        return ans[0];
    }
}
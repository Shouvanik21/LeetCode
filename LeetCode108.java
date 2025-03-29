public class LeetCode108 {
    public static TreeNode createBinarySearchTree(int temp[],int left,int right){
        if(left>right){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(temp[mid]);
        root.left=createBinarySearchTree(temp,left,mid-1);
        root.right=createBinarySearchTree(temp,mid+1,right);
        return root;
    }   
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBinarySearchTree(nums,0,nums.length-1);
    }
}

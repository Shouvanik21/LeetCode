public class LeetCode2265{
    int ans=0;
    public int[] help(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        int l[]=help(root.left);
        int r[]=help(root.right);
        int s=l[0]+r[0]+root.val;
        int c=1+l[1]+r[1];
        if(root.val==s/c)
        ans+=1;
        return new int[]{s,c};
    }
    public int averageOfSubtree(TreeNode root) {
        if(root==null)
        return 0;
        int t[]=help(root);
        return ans;
    }
}
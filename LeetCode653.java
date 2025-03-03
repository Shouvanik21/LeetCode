public class LeetCode653{
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer>set=new HashSet<>();
        if(root==null){
            return false;
        }
        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
           if(set.contains(k-curr.val)){
            return true;
           }
           set.add(curr.val);
           if(curr.left!=null){
            q.add(curr.left);
           }
           if(curr.right!=null){
            q.add(curr.right);
           }
        }
        return false;
    }
}
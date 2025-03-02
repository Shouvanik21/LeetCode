public class LeetCode103{
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> temp = new LinkedList<>();
        temp.offer(root);
        boolean ltor = true;

        while (!temp.isEmpty()) {
            int l = temp.size();
            List<Integer> row = new ArrayList<>(Collections.nCopies(l, 0));

            for (int i = 0; i < l; i++) {
                TreeNode node = temp.poll();
                row.set(ltor ? i : l - 1 - i, node.val);

                if (node.left != null) temp.offer(node.left);
                if (node.right != null) temp.offer(node.right);
            }

            ltor = !ltor;
            ans.add(row);
        }

        return ans;
    }
}
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int count = 0;
        while (q.size() > 0) {
            int n = q.size();
            count++;
            for (int i = 0; i < n; i ++) {
                TreeNode node = q.remove();
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right !=null) {
                    q.add(node.right);
                }
            }
        }
        return count;
    }
}
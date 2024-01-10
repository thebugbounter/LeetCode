class Solution {
    public int amountOfTime(TreeNode root, int start) {
        int ans = -1;
        Map<Integer, List<Integer>> graph = getGraph(root);
        Queue<Integer> q = new LinkedList<>(Collections.singletonList(start));
        Set<Integer> seen = new HashSet<>(Collections.singletonList(start));

        for (; !q.isEmpty(); ++ans) {
            for (int sz = q.size(); sz > 0; --sz) {
                final int u = q.poll();
                if (graph.containsKey(u)) {
                    for (final int v : graph.get(u)) {
                        if (!seen.contains(v)) {
                            q.offer(v);
                            seen.add(v);
                        }
                    }
                }
            }
        }

        return ans;
    }

    private Map<Integer, List<Integer>> getGraph(TreeNode root) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        // (node, parent)
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>(Collections.singletonList(new Pair<>(root, -1)));

        while (!q.isEmpty()) {
            Pair<TreeNode, Integer> pair = q.poll();
            TreeNode node = pair.getKey();
            final int parent = pair.getValue();
            if (parent != -1) {
                graph.computeIfAbsent(parent, k -> new ArrayList<>()).add(node.val);
                graph.computeIfAbsent(node.val, k -> new ArrayList<>()).add(parent);
            }
            if (node.left != null)
                q.add(new Pair<>(node.left, node.val));
            if (node.right != null)
                q.add(new Pair<>(node.right, node.val));
        }

        return graph;
    }
}

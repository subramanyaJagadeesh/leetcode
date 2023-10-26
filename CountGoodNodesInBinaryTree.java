public class CountGoodNodesInBinaryTree {
    //Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
    //
    //Return the number of good nodes in the binary tree.
     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
    }
    public int dfs(TreeNode root, int max){
        int val = 0;
        if(root == null){
            return 0;
        }
        if(root.val >= max){
            max = root.val;
            val = 1;
        }
        return dfs(root.left, max) + dfs(root.right, max) + val;
    }

    public int goodNodes(TreeNode root) {
        return dfs(root.left, root.val)+dfs(root.right, root.val) + 1;
    }
}

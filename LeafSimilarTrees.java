import java.util.LinkedList;
import java.util.Queue;

public class LeafSimilarTrees {
    //Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.
    //
    //
    //
    //root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,9,8]
    //
    //Two binary trees are considered leaf-similar if their leaf value sequence is the same.
    //
    //Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
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
    public void dfs(TreeNode root, Queue<Integer> s){
        if(root == null){
            return;
        }
        dfs(root.left, s);
        if(root.left == null && root.right == null){
            s.add(root.val);
        }
        dfs(root.right, s);

    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Queue<Integer> s1 = new LinkedList<>();
        Queue<Integer> s2 = new LinkedList<>();
        dfs(root1, s1);
        dfs(root2, s2);
        while(!s1.isEmpty()){
            if(!s1.poll().equals(s2.poll())){
                return false;
            }
        }
        return s1.size() == s2.size();
    }
}

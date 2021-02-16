/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode cur = null;
    public void flatten(TreeNode root) {
        if(root == null)
        {
            return;
        }
        flatten(root.right);
        flatten(root.left);
        root.right = cur;
        root.left = null;
        cur = root;
        
    }
}
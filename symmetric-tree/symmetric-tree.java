/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
public static boolean rec(TreeNode Lroot, TreeNode Rroot){
if(Lroot ==null && Rroot == null){
    return true;
}
if(Lroot ==null || Rroot ==null)return false;

if(Lroot.val != Rroot.val){
    return false;
}
return rec(Lroot.left,Rroot.right) && rec(Lroot.right, Rroot.left);

}

    public boolean isSymmetric(TreeNode root) {
        if(root ==null)return false;
return rec(root.left, root.right);
    }
}

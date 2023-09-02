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
import java.util.*;
class Solution {
    public static TreeNode sortedArrayHelper(int[] nums, int si, int ei){
        if(si>ei)return null;
        
        int mid = si +(ei-si)/2;
        
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayHelper(nums, si, mid-1);
               root.right = sortedArrayHelper(nums,mid+1, ei);
        return root;
 
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        
        
        return sortedArrayHelper(nums,0,nums.length-1);
        
        
    }
}
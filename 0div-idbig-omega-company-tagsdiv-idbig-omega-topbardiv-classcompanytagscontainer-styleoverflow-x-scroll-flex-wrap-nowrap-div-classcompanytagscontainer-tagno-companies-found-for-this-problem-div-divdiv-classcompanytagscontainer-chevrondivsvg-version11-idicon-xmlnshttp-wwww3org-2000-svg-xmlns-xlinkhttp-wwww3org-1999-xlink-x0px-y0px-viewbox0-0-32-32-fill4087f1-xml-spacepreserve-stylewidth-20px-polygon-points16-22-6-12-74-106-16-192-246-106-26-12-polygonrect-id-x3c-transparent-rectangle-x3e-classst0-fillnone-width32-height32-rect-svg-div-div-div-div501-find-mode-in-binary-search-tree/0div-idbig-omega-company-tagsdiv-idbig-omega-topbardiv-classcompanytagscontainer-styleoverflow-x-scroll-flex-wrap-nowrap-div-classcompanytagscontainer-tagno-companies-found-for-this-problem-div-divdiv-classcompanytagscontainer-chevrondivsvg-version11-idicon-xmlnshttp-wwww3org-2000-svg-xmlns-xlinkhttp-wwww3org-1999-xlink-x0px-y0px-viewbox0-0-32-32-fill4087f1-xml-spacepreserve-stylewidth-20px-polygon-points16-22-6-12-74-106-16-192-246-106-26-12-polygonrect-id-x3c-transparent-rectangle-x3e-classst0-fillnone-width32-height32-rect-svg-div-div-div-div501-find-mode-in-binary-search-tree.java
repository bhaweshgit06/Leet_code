import java.util.*;
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

    public static ArrayList<Integer> mode(TreeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null)return list;
        list.add(root.val);
       
        ArrayList<Integer> left = mode(root.left);
        ArrayList<Integer> right = mode(root.right);
        if(left != null){
            list.addAll(left);
        }
        if(right != null){
            list.addAll(right);
        }
        return list;

    }

    public int[] findMode(TreeNode root) {
        ArrayList<Integer> list = mode(root);
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i : list){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
                count++;
            }else{
                map.put(i,1);
            }
        }
        
        ArrayList<Integer> list1 = new ArrayList<>();
        int max = 0;
        for(int i : map.keySet()){
            if( map.get(i)>max){
                max = map.get(i);
                list1.clear();
                list1.add(i);
               
            }else if(map.get(i) ==max){
                list1.add(i);
            }
        }
        int ans[] = new int[list1.size()];
        int j = 0;
        for(int i : list1){
            ans[j++] = i;
        }
          int ans1[] = new int[list.size()];
        int k = 0;
        for(int i : list){
            ans1[k++] = i;
        }
       if(count >0){
           return ans;
       }else return ans1;
    }
}
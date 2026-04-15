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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list1 = new ArrayList<>();

        inorder(root, list1);
        
        return list1.get(k - 1);
        
    }
    public void inorder(TreeNode root, List<Integer> myList){
        if(root == null){
            return;
        }
        inorder(root.left, myList);
        myList.add(root.val);
        inorder(root.right, myList);
    }
}

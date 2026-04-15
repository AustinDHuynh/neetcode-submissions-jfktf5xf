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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> myList = new ArrayList<>();

        Queue<TreeNode> myQueue = new LinkedList<>();

        if(root != null){
            myQueue.offer(root);
        }
        while(!myQueue.isEmpty()){
            TreeNode rightSide = null;
            int size = myQueue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = myQueue.poll();
                if(node != null){
                    rightSide = node;
                    myQueue.offer(node.left);
                    myQueue.offer(node.right);
                }
            }
            if(rightSide != null){
                myList.add(rightSide.val);
            }
        }
        return myList;
    }
}
